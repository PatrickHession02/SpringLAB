FROM openjdk:19
COPY target/ /tmp
WORKDIR /tmp
CMD java -jar SpringLAB-0.01-SNAPSHOT.jar