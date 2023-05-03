FROM openjdk
MAINTAINER Kapil
COPY target/tower-demo-client-0.0.1-SNAPSHOT.jar tower-demo-client-0.0.1-SNAPSHOT.jar
ENTRYPOINT java -jar tower-demo-client-0.0.1-SNAPSHOT.jar
