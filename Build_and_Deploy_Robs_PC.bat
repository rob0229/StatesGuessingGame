cd C:\\Developer\\StatesGuessingGame
echo ***INFO MESSAGE*** Building Project
call mvn clean install
cd C:\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\bin
echo ***INFO MESSAGE*** Shutting down Tomcat
call shutdown.bat
cd C:\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\webapps
echo ***INFO MESSAGE*** Deleting Old War
del -rf StatesGuessingGame*
echo ***INFO MESSAGE*** Copying New WAR to Tomcat
copy C:\Developer\StatesGuessingGame\target\StatesGuessingGame.war C:\Developer\apache-tomcat-8.0.23-windows-x64\apache-tomcat-8.0.23\webapps
cd C:\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\bin
echo ***INFO MESSAGE*** Starting Tomcat
call startup.bat & PAUSE