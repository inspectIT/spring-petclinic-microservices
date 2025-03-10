# Just using the build artifact
# Please use mvn install
FROM eclipse-temurin:17

ENV SPRING_PROFILES_ACTIVE docker


VOLUME /tmp

# Add Spring Boot app.jar to Container
COPY "target/spring-petclinic-soap-service-*-SNAPSHOT.jar" app.jar
COPY  "target/classes/application.yml" application.yml

# Workaroung, cause the service-definition references the file from the wrong location
COPY "target/classes/service-api-definition" /service/src/main/resources/service-api-definition

# Fire up our Spring Boot app by default
CMD [ "sh", "-c", "java -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
