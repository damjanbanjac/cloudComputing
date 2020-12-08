FROM maven:3.6.3-ibmjava-8-alpine AS cloud
WORKDIR /usr/src/cloud
COPY . .
RUN mvn package -DskipTests


FROM openjdk:8-jdk-alpine
EXPOSE 8081
ENV URL_POSTGRES="jdbc:postgresql://localhost:5432/cloud"
ENV USERNAME_POSTGRES="postgres"
ENV PASSWORD_POSTGRES="root"
COPY --from=cloud /usr/src/cloud/target/cloudProject.jar cloudProject.jar
CMD java -jar cloudProject.jar

#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]