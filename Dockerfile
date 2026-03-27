# Use Java 17
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy all files
COPY . .

# Give permission and build project
RUN chmod +x mvnw && ./mvnw clean install -DskipTests

# Expose port (Render uses 8080)
EXPOSE 8080

# Run the application
CMD ["sh", "-c", "java -jar target/*.jar"]