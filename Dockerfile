FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER CaptWalker
COPY pom.xml /build/
COPY src /build/src
WORKDIR /build/
RUN mvn package
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/*.jar /app/app.jar
ENV HOST=0.0.0.0 PORT=8080
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "app.jar"]