FROM openjdk:21-jdk

WORKDIR /app

COPY target/WorldCupT20-0.0.1-SNAPSHOT.jar /app/WorldCupT20.jar

EXPOSE 8080

#CMD ["java", "-jar", "/app/WorldCupT20.jar"] or add WORKDIR /app
CMD ["java", "-jar", "WorldCupT20.jar"]

