FROM adoptopenjdk/openjdk11:jdk-11.0.8_10-alpine
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=docker", "/app.jar"]