## Version 0.8.5 New features & Bug Fixing ##
In this version was made:
  * A refactoring file model loader.Mainly was to support unicode characters like unicode (\u099)
  * Also made changes to keep columns size
  * WildcardPath modifications to support all chars in file names
  * Keep focus in created key
  * Internacionalizations of texts
  * Bug fixing

|Id|Type|Priority|Description|
|:-|:---|:-------|:----------|
|[32](http://code.google.com/p/localizedproperties/issues/detail?id=32)|Defect|Medium  |No se pueden abrir archivos que tengas Ñ en el nombre|
|[69](http://code.google.com/p/localizedproperties/issues/detail?id=69)|Defect|Medium  |Agregar autosize a las columnas|
|[80](http://code.google.com/p/localizedproperties/issues/detail?id=80)|Defect|Medium  |Soportar ficheros unicode y filtrar idiomas|
|[96](http://code.google.com/p/localizedproperties/issues/detail?id=96)|Enhancement|Medium  |UTF-8 support|
|[97](http://code.google.com/p/localizedproperties/issues/detail?id=97)|Enhancement|Medium  |UTF-8 support|
|[99](http://code.google.com/p/localizedproperties/issues/detail?id=99)|Enhancement|Medium  |Loading file error|
|[100](http://code.google.com/p/localizedproperties/issues/detail?id=100)|Enhancement|Medium  |java.io.IOException: Mark invalid by opening large propertie files|
|[101](http://code.google.com/p/localizedproperties/issues/detail?id=101)|Enhancement|Medium  |Escaped chars must be an option|

## Version 0.8.1 Bug Fixing ##
|Id|Type|Priority|Description|
|:-|:---|:-------|:----------|
|[72](http://code.google.com/p/localizedproperties/issues/detail?id=72)|Enhancement|Medium  |Friendly description when the plugin doesn't find an appropiate wildcard|
|[77](http://code.google.com/p/localizedproperties/issues/detail?id=77)|Defect|Medium  |Sort problem on default language column|
|[79](http://code.google.com/p/localizedproperties/issues/detail?id=79)|Defect|Medium  |Adding new repeated key doesn't dispatch an error message|
|[82](http://code.google.com/p/localizedproperties/issues/detail?id=82)|Defect|Medium  |Problem with removing recently added wildcard|
|[83](http://code.google.com/p/localizedproperties/issues/detail?id=83)|Enhancement|Medium  |It must be implemented variant of Locale|
|[84](http://code.google.com/p/localizedproperties/issues/detail?id=84)|Defect|Medium  |A bug in Properties wizard|
|[86](http://code.google.com/p/localizedproperties/issues/detail?id=86)|Defect|Medium  |Wizard return invalid filename, without country infomation|
|[89](http://code.google.com/p/localizedproperties/issues/detail?id=89)|Defect|Medium  |Defaults Wildcards cannot be reloaded|

_Thank you to Rafal, for his help for this release_

## Version 0.8 ##

  * In this version has been improved WildcardPath to support more complex paths
  * The ResourceList has been improved with a best algorithm to discover files
  * Best error report in Eclipse error log framework
  * Now you can add optional parts into wildcard path descriptor (see WildcardPath documentation for more details)

### Fixed Issues ###
|Id|Description|
|:-|:----------|
|[38](http://code.google.com/p/localizedproperties/issues/detail?id=38)|Files Changes detection|
|[42](http://code.google.com/p/localizedproperties/issues/detail?id=42)|Bug creating file only with language|
|[48](http://code.google.com/p/localizedproperties/issues/detail?id=48)|Error adding new locale|
|[56](http://code.google.com/p/localizedproperties/issues/detail?id=56)|Error loading related files|
|[57](http://code.google.com/p/localizedproperties/issues/detail?id=57)|Error open files, they are open crossed|
|[61](http://code.google.com/p/localizedproperties/issues/detail?id=61)|Open other type of files. Ej: .ini Used by Joomla|
|[70](http://code.google.com/p/localizedproperties/issues/detail?id=70)|Renaming key, just rename into default locale|
|[71](http://code.google.com/p/localizedproperties/issues/detail?id=71)|Null Pointer Exception with files only with language|
|[73](http://code.google.com/p/localizedproperties/issues/detail?id=73)|RuntimeException when I try to open any properties file|
|[74](http://code.google.com/p/localizedproperties/issues/detail?id=74)|wrong duplicated key handling after sort by KEY|

## Version 0.7.5 ##
_Under update_

## Version 0.7 ##
_Under update_


## Version 0.6 ##
_Under update_

|Id|Description|
|:-|:----------|
|[9](http://code.google.com/p/localizedproperties/issues/detail?id=9)|Sinchronization Files Model|
|[14](http://code.google.com/p/localizedproperties/issues/detail?id=14)|Resource Files without country|
|[29](http://code.google.com/p/localizedproperties/issues/detail?id=29)|Bug WildcardPath|
|[31](http://code.google.com/p/localizedproperties/issues/detail?id=31)|GWT Files Support|
|[51](http://code.google.com/p/localizedproperties/issues/detail?id=51)|Sortable Locales|

## Version 0.5 ##