FROM maven:3.9.6-eclipse-temurin-21
WORKDIR /workspace
COPY . .
RUN mvn clean test
