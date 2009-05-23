package com.triadsoft.properties.editors;

import java.util.Locale;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.MultiPageEditorPart;

import com.triadsoft.common.properties.ILocalizedPropertyFileListener;
import com.triadsoft.properties.model.ResourceList;
import com.triadsoft.properties.model.utils.PropertyTableViewer;
import com.triadsoft.properties.model.utils.WildcardPath;

/**
 * <p>
 * Editor que muestra la grilla de datos de las propiedades, viendo en la
 * primera columna las claves y en las dem�s los distintos idiomas.
 * </p>
 * <p>
 * El editor intentar� descubrir seg�n el path de los archivos de recursos,los
 * distintos idiomas a los que se encuentran los resource bundle. Para �sto
 * utiliza el WildcardPath.
 * </p>
 * <p>
 * Segun los distintos lenguajes de programacion, los archivos de recursos est�n
 * en distintas ubicaciones con distintas convenciones en el nombre de los
 * archivos y la ubicacion de los mismos.
 * </p>
 * <p>
 * Por �ste motivo es que el Properties editor intenta buscar seg�n el path del
 * archivos cual es el wildcard path de cada uno.
 * </p>
 * 
 * @author Triad (flores.leonardo@triadsoft.com.ar)
 * @see WildcardPath
 * @see ResourceBundle
 */
public class PropertiesEditor extends MultiPageEditorPart implements
		IResourceChangeListener, ILocalizedPropertyFileListener {

	protected static final String KEY_COLUMN_ID = "key_column";

	/** The text editor used in page 0. */
	private PropertyTableViewer tableViewer;

	private TextEditor textEditor;

	/** The text widget used in page 2. */
	private StyledText text;

	private ResourceList resource;

	private boolean isModified;

	/**
	 * Crea un editor de propiedades
	 */
	public PropertiesEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	public ResourceList getResource() {
		return resource;
	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		IFile file = ((IFileEditorInput) getEditorInput()).getFile();
		resource = new ResourceList(file);
		createPage0();
		createPage1();
		setPartName(resource.getFileName());
		// createPage2();
	}

	/**
	 * Crea la pagina que contiene la tabla donde se muestran los recursos
	 */
	private void createPage0() {
		Locale locale = resource.getDefaultLocale();
		tableViewer = new PropertyTableViewer(getContainer(), locale);
		tableViewer.setContentProvider(new PropertiesContentProvider());
		tableViewer.setLabelProvider(new PropertiesLabelProvider(tableViewer));
		tableViewer.setLocales(resource.getLocales());
		tableViewer.setInput(resource);
		tableViewer.setCellModifier(new PropertyModifier(this));
		int index = addPage(tableViewer.getControl());
		setPageText(index, "Properties");
	}

	/**
	 * Crea la solapa que contiene el texto
	 */
	void createPage1() {
		try {
			textEditor = new TextEditor();
			int index = addPage(textEditor, getEditorInput());
			// TODO:Localize it
			setPageText(index, "Content");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	void createPage2() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		text = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		text.setEditable(false);

		int index = addPage(composite);
		setPageText(index, "Preview");
	}

	protected void tableChanged() {
		isModified = true;
		if (!super.isDirty()) {
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}

	@Override
	protected void handlePropertyChange(int propertyId) {
		if (propertyId == IEditorPart.PROP_DIRTY) {
			isModified = isDirty();
		}
		super.handlePropertyChange(propertyId);
	}

	@Override
	public boolean isDirty() {
		return isModified || super.isDirty();
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	void updateTitle() {
		IEditorInput input = getEditorInput();
		// setTitle(input.getName());
		setTitleToolTip(input.getToolTipText());
	}

	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		// getEditor(0).doSave(monitor);
		resource.save();
		isModified = false;
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the
	 * text for page 0's tab, and updates this multi-page editor's input to
	 * correspond to the nested editor's.
	 */
	public void doSaveAs() {
		// IEditorPart editor = getEditor(0);
		// editor.doSaveAs();
		// setPageText(0, editor.getTitle());
		// setInput(editor.getEditorInput());
		// updateTitle();
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}

	public void setFocus() {
		switch (getActivePage()) {
		case 0:
			tableViewer.getTable().setFocus();
			break;
		case 1:
			textEditor.setFocus();
			break;
		}
	}

	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException(
					"Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
	}

	/**
	 * No se permite el save as porque hay varios archivos que se est�n editando
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}

	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		// Codigo aplicado a la pagina seleccionada
	}

	/**
	 * TODO: Escucha los cambios de los recursos en el workspace, por el momento
	 * no aplica. Deber�a escuchar cada archivo de properties que se crea o
	 * modifica para poder sincronizarlo con la tabla que se est�m mostrando
	 * 
	 * @param event
	 */
	public void resourceChanged(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					// IWorkbenchPage[] pages = getSite().getWorkbenchWindow()
					// .getPages();
					// for (int i = 0; i < pages.length; i++) {
					// if (((FileEditorInput) editor.getEditorInput())
					// .getFile().getProject().equals(
					// event.getResource())) {
					// IEditorPart editorPart = pages[i].findEditor(editor
					// .getEditorInput());
					// pages[i].closeEditor(editorPart, true);
					// }
					// }
				}
			});
		}
	}

	/**
	 * Cada vez que se agrega o modifica el valor de una columna se actualiza
	 * 
	 * @param key
	 *            Clave que se modifica
	 * @param value
	 *            Valor modificado
	 * @param locale
	 *            Locale en el que se modifico el valor
	 */
	public void valueChanged(String key, String value, Locale locale) {
		tableChanged();
		resource.changeValue(key, value, locale);
		tableViewer.refresh();
	}

	public void keyAdded(String key, Locale locale) {
		tableChanged();
		tableViewer.refresh();
	}
}
