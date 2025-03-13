FROM maven:3.8.4-openjdk-17 AS build


WORKDIR /app


COPY pom.xml .
COPY .mvn/ .mvn/
COPY mvnw mvnw
RUN chmod +x ./mvnw
RUN ./mvnw dependency:go-offline


COPY src ./src


RUN ./mvnw package -DskipTests



FROM eclipse-temurin:11-jre-jammy


WORKDIR /app


COPY --from=build /app/target/*.jar app.jar


EXPOSE 25000


ENTRYPOINT ["java", "-jar", "app.jar"]