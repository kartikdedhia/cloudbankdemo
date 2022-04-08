FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
ENV PORT 8080
EXPOSE 8080
COPY ${JAR_FILE} cloudbankdemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cloudbankdemo-0.0.1-SNAPSHOT.jar"]