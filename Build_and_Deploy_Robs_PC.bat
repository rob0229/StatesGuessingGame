cd /D F:\\Rob\\Developer\\StatesGuessingGame
call mvn clean install
cd F:\\Rob\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\bin
call shutdown.bat
cd F:\\Rob\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\webapps
del -rf StatesGuessingGame*
call copy F:\Rob\Developer\StatesGuessingGame\target\StatesGuessingGame.war F:\Rob\Developer\apache-tomcat-8.0.23-windows-x64\apache-tomcat-8.0.23\webapps
cd F:\\Rob\\Developer\\apache-tomcat-8.0.23-windows-x64\\apache-tomcat-8.0.23\\bin
call startup.bat & PAUSE