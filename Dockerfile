FROM maven

COPY **/helloworld-#{AppVersion}#.jar /helloworld.jar

CMD ["java", "-jar", "/helloworld.jar"]
