# Sử dụng OpenJDK 17 (ổn định hơn
FROM openjdk:22-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép toàn bộ project vào container
# Build project trong container (nếu chưa có JAR)

# Định nghĩa đường dẫn JAR đúng
CMD ["java", "-jar", "app.jar"]

# Expose cổng 8080
EXPOSE 8080
