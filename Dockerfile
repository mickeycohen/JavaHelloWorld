FROM maven

COPY **/target/helloworld-#{AppVersion}#.jar /helloworld.jar

CMD ["java", "-jar", "/helloworld.jar"]
