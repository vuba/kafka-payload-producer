FROM openjdk:11.0.8-jdk-slim-buster
COPY target/kafka-payload-producer-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]