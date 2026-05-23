FROM eclipse-temurin:21-alpine
RUN mkdir /opt/app
COPY target/hello-world-docker-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/hello-world-docker-0.0.1-SNAPSHOT.jar"]