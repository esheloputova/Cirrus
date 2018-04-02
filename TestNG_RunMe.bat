set projectLocation=C:\Elena\Java\Cirrus_maven
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\src\testng.xml
pause




