# Docker multi-stage build

# 1. Building the App with Maven
FROM maven:3.9.7-eclipse-temurin-17

ADD . /service
WORKDIR /service

# Just echo so we can see, if everything is there :)
RUN ls -l

# Run Maven build
RUN mvn clean install -DskipTests


# Just using the build artifact and then removing the build-container
FROM eclipse-temurin:17

MAINTAINER Jonas Hecht

ENV SPRING_PROFILES_ACTIVE docker


VOLUME /tmp

# Add Spring Boot app.jar to Container
COPY --from=0 "/service/target/service-*-SNAPSHOT.jar" app.jar
COPY --from=0 "/service/target/classes/application.yml" application.yml

# Workaroung, cause the service-definition references the file from the wrong location
COPY --from=0 "/service/target/classes/service-api-definition" /service/src/main/resources/service-api-definition

# Fire up our Spring Boot app by default
CMD [ "sh", "-c", "java -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]