# Start with a base image containing Java runtime
FROM openjdk:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/spring-cloud-stream-consumer.jar spring-cloud-stream-consumer.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","spring-cloud-stream-consumer.jar"]