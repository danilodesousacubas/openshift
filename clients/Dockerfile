FROM openjdk:8-jdk-alpine

#ARG user=clients
#ARG group=clients
#ARG uid=1000
#ARG gid=1000
#ARG http_port=8080
#ARG agent_port=50000

VOLUME /tmp
ARG JAR_FILE
COPY target/products-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]