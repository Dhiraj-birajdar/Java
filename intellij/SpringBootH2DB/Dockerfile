FROM openjdk:21-jdk
LABEL authors="Decode"

WORKDIR /app

COPY target/SpringBootH2DB-0.0.1-SNAPSHOT.jar /app/SpringBootH2DB.jar

EXPOSE 8080

CMD ["java", "-jar", "SpringBootH2DB.jar"]