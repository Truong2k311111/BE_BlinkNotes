# Sử dụng OpenJDK 17 (ổn định hơn
FROM openjdk:22-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép toàn bộ project vào container
COPY . .

# Build project trong container (nếu chưa có JAR)
#RUN ./gradlew shadowJar || ./gradlew build

# Định nghĩa đường dẫn JAR đúng
CMD ["java", "-jar", "build/libs/ktor-sample-all.jar"]

# Expose cổng 8080
EXPOSE 8080
