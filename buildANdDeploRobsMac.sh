#!/bin/sh
cd /Developer/StatesGuessingGame
mvn clean install
cd /Developer/apache-tomcat-7.0.61/bin
./shutdown.sh
cd ../webapps
rm -rf States*
cp /Developer/StatesGuessingGame/target/StatesGuessingGame.war /Developer/apache-tomcat-7.0.61/webapps
cd /Developer/apache-tomcat-7.0.61/bin
./catalina.sh run


