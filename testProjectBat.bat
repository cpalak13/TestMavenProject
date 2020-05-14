set projectLocation=
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\*
java org.testng.TestNG %projectLocation%\testng.xml
pause