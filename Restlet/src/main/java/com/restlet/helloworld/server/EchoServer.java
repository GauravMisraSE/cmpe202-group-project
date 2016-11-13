package com.restlet.helloworld.server;

/**
 * Created by susha on 28-10-2016.
 */

import org.restlet.Application;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.Server;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;

/**
 * Setting basic application properties.
 */
public class EchoServer extends Application {

    /**
     * Launches the application with an HTTP server.
     *
     * @param args
     *            The arguments.
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Server server = new Server(Protocol.HTTP, 8111);
        server.setNext(new EchoServer());
        server.start();
    }

    /**
     * Constructor.
     */
    public EchoServer() {
        setName("RESTful Echo Server");
        setDescription("Example from Restlet in Action");
        setOwner("Restlet S.A.S.");
        setAuthor("The Restlet Team");
    }

    /**
     * Creates a root Restlet to trace requests.
     */
    @Override
    public Restlet createInboundRoot() {
        return new Restlet() {
            @Override
            public void handle(Request request, Response response) {
                String entity = "Method       : " + request.getMethod()
                        + "\nResource URI : " + request.getResourceRef()
                        + "\nIP address   : "
                        + request.getClientInfo().getAddress()
                        + "\nAgent name   : "
                        + request.getClientInfo().getAgentName()
                        + "\nAgent version: "
                        + request.getClientInfo().getAgentVersion();
                response.setEntity(entity, MediaType.TEXT_PLAIN);
            }
        };
    }
}
