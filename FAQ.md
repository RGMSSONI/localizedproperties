### When I open a property file, I receive an error that said "I didn't find a wildcard that match with ..." ###
You can try open the Localization Properties, and add your own [WildcardPath](WildcardPath.md) that must describe the file path to discover
![http://localizedproperties.googlecode.com/svn/wiki/images/localizedPreferences.png](http://localizedproperties.googlecode.com/svn/wiki/images/localizedPreferences.png)

### How I could get both Finnish and English versions of my properties files? ###
If you don't have a file that matches with a [WildcardPath](WildcardPath.md), you must to create it and put it in the first place in the list.
The next time that you open the editor, the editor will try to open from this place.

Or you can make right click on opened editor and select add Locale and follow the wizard.
![http://localizedproperties.googlecode.com/svn/wiki/images/addLocale.png](http://localizedproperties.googlecode.com/svn/wiki/images/addLocale.png)


Regards.

### Why my installation of plugin is not translated in my own language? ###
Nowadays the plugin was translated to english and spanish.


I have made some tests to discover some problems about translations, but I
didn't reproduce them.
I tested it changing the default locale in eclipse.ini file into
eclipse instalation.
You must to add two param after -vmargs params to test this.
The params are **-Duser.language** and **-Duser.country**, and must to be
followed by two letter code of language and two letters code of
country respectively (see de example)
If you use an unsupported locale (language+country) the plugin will
use default translation english

eclipse.ini located into Eclipse instalation folder

```
-vmargs
-Dosgi.requiredJavaVersion=1.5
-Xms512m
-Xmx1024m
-Djava.net.preferIPv4Stack=true
-Duser.language=en
-Duser.country=US
```

Explanation about how to change system locale in Eclipse

http://dev.hopbit.net/index.php/2011/04/19/how-to-change-the-default-language-in-radeclipse-on-windows/

List of Language Codes

http://www.loc.gov/standards/iso639-2/php/code_list.php

List of Country Codes

http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements

I will apreciate all comments of questions about this.

If you want to see the plugin in your own language, please [contact me](mailto:flores.leonardo@gmail.com)