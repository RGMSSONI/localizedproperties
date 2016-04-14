# Introducción #
WildcardPath is a piece of text that try to describe an estructure of folder + file + locale (language & country) used by the plugin to discover asociated files.
This piece of text is like a simple regular expresion (simplified) that show to the plugin, how to search files into your project.

# Details #
The wildcard path have fixed tokens that can be used in distincts form to build the path to some file.

The common structure is:
**/{root}/{filename}.{lang}.{country}.{fileextension}**

  * Folder separators are **/**
  * **{root}** Represents the folder base to store the properties
  * **{filename}** Is the wildcard that represents the filename
  * **{fileextension}** Again is the representation of fileextension
  * **{lang}** Represents 2 letters lower case code of language [ISO Language Codes Wikipedia](http://en.wikipedia.org/wiki/ISO_639)
  * **{country}** Represents 2 letters upper case country codes [ISO Country Codes Wikipedia](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)

![http://localizedproperties.googlecode.com/svn/wiki/images/wildcardpathEditor.png](http://localizedproperties.googlecode.com/svn/wiki/images/wildcardpathEditor.png)

It has been extended wildcard functionality and we can describe optional attributes and an order to avoid it to try to match similar files.
Now you can enclose part of path into curly braces and a number to the end that indicates search sort. Let's go to an example

/{root}/{filename}**(**.{lang}**)2****(**.{country}**)1**.{fileextension}

Here I'm telling that country and language, are optional. When the file matcher use this wp, will make.
  * Test full wildcard matches
  * Test wildcard without country an . character, enclosed with curly bracket and marked like first optional parameter
  * If doesn't match, try avoiding the optional marked like second option


## Common languages ##
### [Java](http://java.sun.com/developer/technicalArticles/Intl/ResourceBundles/) ###
  * Default property is in `com.mipaquete.MiProperty.properties`
  * The locale es AR is founded in `com.mypackage.MyProperty.es_AR.properties`
  * The i18n of en US is showed in `com.mypackage.MyProperty.en_US.properties`

### Struts ###
_To Explain_

## [Flex](http://livedocs.adobe.com/flex/3/html/help.html?content=l10n_6.html) ##
  * In Flex commonly the files are included in src/locale folder
  * Unlike Java, Flex uses locale as folder name instead use locale in filename.


## Joomla ##
_To Explain_

### WildcardPath Configuration Screen ###

![http://localizedproperties.googlecode.com/svn/wiki/images/localizedPreferences.png](http://localizedproperties.googlecode.com/svn/wiki/images/localizedPreferences.png)