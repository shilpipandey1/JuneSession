set ProjectPath=C:\Users\SHILPI.PANDEY\eclipse-workspace\JavaTraining\MRLPAutomation
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\Lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testsuite.xml