FROM alpine:latest

RUN apk add openjdk17
COPY build/libs/java-api-cat.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
