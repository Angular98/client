FROM openjdk:8
COPY target/demo-0.0.1-SNAPSHOT.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /demo-0.0.1-SNAPSHOT.jar