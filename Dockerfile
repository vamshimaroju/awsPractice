# define base docker image

FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} aws-practice.jar
ENTRYPOINT ["java","-jar","/aws-practice.jar"]