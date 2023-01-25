FROM adoptopenjdk/openjdk8
COPY "./target/spring-1.0.jar" "spring-1.0.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-1.0.jar"]