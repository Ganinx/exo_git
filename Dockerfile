FROM maven:3.8.1-jdk-11 AS build
WORKDIR /git

COPY pom.xml .
COPY src ./src

RUN mvn clean package

FROM openjdk:11-jre-slim
WORKDIR /git

COPY --from=build /git/target/git-1.0-SNAPSHOT.jar /git/git-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/git/git-1.0-SNAPSHOT.jar"]

#Pour creer l'image docker
#docker build -t myapp:latest .

#Pour l'exécuter
#docker run -p 8080:8080 myapp:latest
