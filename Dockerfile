FROM eclipse-temurin:25-jre
WORKDIR /app
COPY target/evenodd-ci-1.0.0.jar app.jar
CMD ["java", "-cp", "app.jar", "com.example.EvenOdd"]