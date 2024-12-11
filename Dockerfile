FROM selenium/standalone-chrome:131.0
USER root
RUN apt-get update && apt-get install -y openjdk-21-jdk
USER seluser
WORKDIR /app
COPY target/*.jar /app/app.jar
COPY lib/*.jar /app/lib/
#ENTRYPOINT ["java", "-cp", "/app/app.jar:/app/lib/*", "com.shoalter.Main"]
