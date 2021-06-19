# hepsiemlak_case1_desktop

HEY!
Its a Selenium with Java Automation WEB case project.

This project used maven , junit , log4j and page object model (POM)

Here these case steps:

-case goto hepsiemlak.com

-click the "Satılık”

-filters are

-Izmir 
-Bornova
-İş Yeri
-Fiyat : 100.000 TL - 2.000.000 TL
-Bina Yaşı: Sıfır Bina, 1-5, 6-10

-search and page list opened

-Check FOR Tags in the filter area

END.
--------------------------------------------------------------------------------------

If U want to download your steps are here.

if u use like intellije

i'm advice maven and java 1.8sdk down and select your project structure

Check your POM.XML file

maven ,junit,log4j versions are so important

and in intellije click to left side big blue 'M' its Maven target and we wait everything gonna be build.

13seconds later..................
check your browser version and its a web case download chromedriver.exe in ----> https://chromedriver.chromium.org/downloads

check your driver i create 4 java file in hepsiemlak_case2_desktopp/src/test/java/ road
WebElementsConstants.java --->all locators are here absolutely everytime check locator
TestSteps.java ---> all case steps functions is here.
TestCases.java ---> call the TestSteps.java function 
BaseMethods.java ---> run my element function with driver in these file
