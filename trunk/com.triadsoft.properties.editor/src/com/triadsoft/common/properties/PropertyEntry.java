/**
 * Created on Sep 14, 2004
 */
package com.triadsoft.common.properties;

import java.io.PrintWriter;

/**
 * @author Triad (flores.leonardo@triadsoft.com.ar)
 */
public class PropertyEntry extends PropertyElement {
	private String key;
	private String value;
	private int lineNumber;
	private int start = 0;
	private int end = 1;

	/**
	 * Crea la propiedad sin el control de la linea
	 * 
	 * @param parent
	 * @param key
	 * @param value
	 */
	public PropertyEntry(PropertyCategory parent, String key, String value) {
		this(parent, key, value, 0, 2, 0);
	}

	public PropertyEntry(PropertyCategory parent, String key, String value,
			int start, int end, int lineNumber) {
		super(parent);
		this.key = key;
		this.value = value;
		this.lineNumber = lineNumber;
		this.start = start;
		this.end = end;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public PropertyElement[] getChildren() {
		return NO_CHILDREN;
	}

	public void setKey(String text) {
		if (key.equals(text))
			return;
		key = text;
		((PropertyCategory) getParent()).keyChanged(this);
	}

	public void setValue(String text) {
		if (text != null && text.trim().length() == 0) {
			value = null;
			return;
		}
		if (value != null && value.equals(text)) {
			return;
		}
		value = text;
		((PropertyCategory) getParent()).valueChanged(this);
	}

	public void removeFromParent() {
		((PropertyCategory) getParent()).removeEntry(this);
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * @see com.triadsoft.common.properties.PropertyElement#hasChildren()
	 */
	public boolean hasChildren() {
		// the end of tree
		return false;
	}

	public void appendText(PrintWriter writer) {
		writer.print(key);
		writer.print("=");
		writer.println(value);
	}

	public int getLine() {
		return this.lineNumber;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getKey() + "=" + getValue();
	}
}