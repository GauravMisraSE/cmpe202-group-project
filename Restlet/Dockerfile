FROM openjdk
EXPOSE 8080
ADD ./target/hello-restlet-jar-with-dependencies.jar /srv/hello-restlet-server.jar
CMD java -cp /srv/hello-restlet-server.jar com.restlet.helloworld.server.HelloWorldServer
