FROM openjdk:rk
VOLUME /tmp
EXPOSE 8080
COPY target/spring-angular*.jar /app/app.jar
CMD ["java","-jar","/app/app.jar"]