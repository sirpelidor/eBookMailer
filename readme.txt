To run this web application, use command line:

1) go to the folder where the pom.xml is located
cd <your path>/com-ebookMailer

2) Have Maven build the archive from source:
mvn clean package

3) go to a newly created folder "target"
cd target

4) execute the jar file
java -jar com-ebookMailer-1.0-SNAPSHOT.jar

5) you'll see something similar to the following shows on console when the webapp is ready:
INFO 2132 --- [           main] com.ebookMailer.App: Started App in 4.192 seconds (JVM running for 4.796)

6) open a browser and visit the app:
http://localhost:9090

