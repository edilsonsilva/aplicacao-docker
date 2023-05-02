FROM openjdk:17.0.1-jdk
EXPOSE 8091
ADD target/app-docker.jar app-docker.jar
ENTRYPOINT [ "java","-jar","/app-docker.jar" ]