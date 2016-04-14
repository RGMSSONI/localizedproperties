## Presentation ##
Many times, in many software projects, we need internationalize labels and texts. Commonly we localize the keys on main language, or our natural language. After time, we start translation in other language. And after time we add a new key in main language, and we forgot translate the another, and again we need translate it. As development progress, the files become desynchronized, and we hear comments such as, "this file don't have these key", "this key is not translated",or something else.

## Objective ##
The objective of plugin is provide an editor where we can review and modify all resource files at once and get a glimpse of the texts for all languages.

![http://localizedproperties.googlecode.com/svn/wiki/images/navigator-editor.png](http://localizedproperties.googlecode.com/svn/wiki/images/navigator-editor.png)

This plugin supports files of various properties of programming languages, since its operation is based in an object called WildcardPath. The WildcardPath is a text string, with a simple structure that allows you to discover the default directory structure where we found the different locales.

## Features ##
**Beta Version. If you use it, is under your responsability**.
  * You can add or remove properties keys
  * Edit localized values
  * Missing translation are highlighted
  * Sorting columns by content, keys or translations (case unsensitive)
  * You can copy a key to clipboard and paste
  * View all languages that you have in your application at glimpse
  * Rapidly you can review, the key that's need translation
  * Create a new localized property file using a wizard
  * You can add a new locale at a right click

### Example ###
![http://localizedproperties.googlecode.com/svn/wiki/images/fulleditor.png](http://localizedproperties.googlecode.com/svn/wiki/images/fulleditor.png)
### Presentation ###
<a href='http://www.youtube.com/watch?feature=player_embedded&v=8SxIqzIMkjg' target='_blank'><img src='http://img.youtube.com/vi/8SxIqzIMkjg/0.jpg' width='500' height=344 /></a>

## Plugin installation Tested On ##
  * Eclipse 3.4.0 Ganymede Java Developer, Build id: I20080617-2000
  * Eclipse 3.4.0 Ganymede J2EE Developer, Build id: I20080617-2000
  * Eclipse 3.5.0 Galileo Java Developer, Build id: 20100218-1602
  * Eclipse 3.6.0 Helios J2EE Developer, Build id: I20100608-0911

All the tests was made with Eclipse without install additional plugins.

## Known Troubles ##
  * No critical errors known, but you can see everything in [Issues List](http://code.google.com/p/localizedproperties/issues/list)

All recomendation are welcome, error reports, or if you test it in another enviroment, I will appreciate all your comments.

Please post it in [Localized Properties Group](http://groups.google.com/group/localizedproperties)

## How to install ##
Currently, the update site version is the only one option to install. The zipped version was not made still. I will assess the possibility of inclusion, according installers feed back.

To install the plugin in the current version of Eclipse,you need to add the url http://localizedproperties.googlecode.com/svn/trunk/helios/ to the update sites in eclipse.


[See how to in older versions...](http://code.google.com/p/localizedproperties/wiki/Install)

Add the update site to eclipse IDE and press install button.
Currently was tested in
  * Eclipse 3.4.0 Ganymede Java Developer, Build id: I20080617-2000
  * Eclipse 3.4.0 Ganymede J2EE Developer, Build id: I20080617-2000
  * Eclipse 3.5.0 Galileo Java Developer, Build id: 20100218-1
  * Eclipse 3.6.0 Helios J2EE Developer, Build id: I20100608-0911

The released version is the [Version 0.8.5](Releases#Version_0.8.5.md) - New features & Bug fixing

If you can test under another Eclipse version I will appreciate your feedback.

## Wiki ##
Currently I started a brief scafold of the wiki structure. I started in spanish, but my objective is release the english documentation with the 1.0 version of plugin.
[BriefIntro](BriefIntro.md)

## Screenshots ##
You can see more the [Screenshots](Screenshots.md) in wiki page

## Notes ##
# Beta Version, please use it under your responsability

If you have troubles, under instalation, dependencies, new version of Eclipse, etc, please [contact me](mailto:flores.leonardo@gmail.com), and I will try to fix it.

## Credits ##
All icons used are taked from excelent free palette "Silk Icon" from famfamfam icons http://www.famfamfam.com/lab/icons/silk/

The background music of video is by [Kyoto Connection](http://www.thekyotoconnection.com/)

## How to help ##
  * You can test this plugin, and send me your opinion or suggestions
  * If you feel that plug in is a good try?, please share it
  * If you downloaded plugin and you feel the need to say thanks?, please help me to support this plugin open and free.

[![](http://localizedproperties.googlecode.com/svn/wiki/images/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=flores%2eleonardo%40gmail%2ecom&lc=AR&item_name=Triadsoft&item_number=Localized%20Properties%20Plugin&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted)