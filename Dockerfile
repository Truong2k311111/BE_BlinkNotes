
FROM openjdk:22-jdk-slim

WORKDIR /app

# Copy file JAR từ stage 1 sang container
COPY ./build/libs/ktor-sample-all.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
