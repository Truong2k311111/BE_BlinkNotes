# Sử dụng JDK 17 để chạy ứng dụng Ktor
FROM openjdk:17

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép file JAR từ thư mục build vào container
COPY build/libs/ktor-sample-all.jar app.jar

# Expose cổng 8080
EXPOSE 8080

# Chạy ứng dụng Ktor
CMD ["java", "-jar", "app.jar"]
