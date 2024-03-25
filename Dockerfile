FROM eclipse-temurin:21-jdk
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
#ENTRYPOINT ["run.sh"]
ENTRYPOINT ["java","-jar","/app.war"]