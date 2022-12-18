FROM openjdk:11
COPY target/classes/ /tmp
WORKDIR /tmp
CMD java -jar ie.atu:SpringLAB:jar:0.0.1-SNAPSHOT.jar