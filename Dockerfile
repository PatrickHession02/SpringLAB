FROM openjdk:11
COPY target/classes/ /tmp
WORKDIR /tmp
CMD java -jar SpringLAB 0.0.1-SNAPSHOT