cd C:\\Developer\\StatesGuessingGame
call mvn clean install
cd C:\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\bin
call shutdown.bat
cd C:\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\webapps
rm -rf StatesGuessingGame*
cp C:\\Developer\\StatesGuessingGame\\target\\StatesGuessingGame.war C:\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\webapps
cd C:\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\bin
call startup.bat