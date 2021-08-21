FROM adoptopenjdk/openjdk8:alpine-slim
ENV APP_NAME helloWorldWebApp
LABEL maintainer=”Alan”
RUN apk update

# install tini
RUN apk add --no-cache tini
COPY target/rest-service-0.0.1-SNAPSHOT.jar /bin

VOLUME /bin
EXPOSE 8080

# use tini to avoid zombie processes and allow better shutdown
ENTRYPOINT [“/sbin/tini”, “-e”, “143”, “-g”, “ — “]

CMD [“java”, “-jar”, “/bin/rest-service-0.0.1-SNAPSHOT.jar”]
