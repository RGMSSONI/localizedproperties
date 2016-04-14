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