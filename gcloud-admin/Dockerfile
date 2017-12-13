FROM java:8-jre-alpine

MAINTAINER Tuli <myway.tuli@gmail.com>

RUN mkdir /app

WORKDIR /app

COPY gcloud-admin-1.0-SNAPSHOT.jar /app

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/gcloud-admin-1.0-SNAPSHOT.jar"]

EXPOSE 8505
