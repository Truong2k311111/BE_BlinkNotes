# Sử dụng JDK 17 để chạy ứng dụng Ktor
FROM openjdk:22-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép file JAR từ thư mục build vào container

# Expose cổng 8080
EXPOSE 8080

# Chạy ứng dụng Ktor
CMD ["java", "-jar", "app.jar"]
