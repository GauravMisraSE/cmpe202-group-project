FROM anapsix/alpine-java
MAINTAINER Sushant Vairagade <sushant.vairagade@sjsu.edu>
COPY target/game-engine.jar /home/game-engine.jar
ENTRYPOINT ["java","-jar","/home/game-engine.jar"]
EXPOSE 8080