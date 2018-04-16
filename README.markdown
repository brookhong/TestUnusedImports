# steps
    mvn assembly:assembly -DdescriptorId=jar-with-dependencies
    java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=6789 -jar target/helloWorld-1.0-SNAPSHOT-jar-with-dependencies.jar

    mvn package
    java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=6789 -cp target/helloWorld-1.0-SNAPSHOT.jar:/Users/zghong/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar HelloLog4j
