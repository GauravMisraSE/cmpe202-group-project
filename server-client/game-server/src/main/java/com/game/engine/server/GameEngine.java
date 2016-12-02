package com.game.engine.server;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

/**
 * Created by Sushant on 06-11-2016.
 */
public class GameEngine {
    @Parameter(names = {"--ipaddress", "-ip"}, description = "IP address of the node")
    private static String ip = "0.0.0.0";
    @Parameter(names = {"--port", "-p"}, description = "Port of the node")
    private static Integer port = 8080;
    private static String uri = "http://%s:%d/engine/";

    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("com.game.engine");
        uri = String.format(uri, ip, port);
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(uri), rc);
    }

    public static void main(String[] args) throws IOException {
        int input = 0;
        HttpServer server =null;
        try {
            GameEngine application = new GameEngine();
            new JCommander(application, args);
            server = startServer();
            System.out.println(String.format("Jersey app started with WADL available at "
                    + "%sapplication.wadl\nHit enter to stop it...", uri));
            System.out.println("Will shut down");
            while (input <= 0) {
                input = System.in.read();
            }
            System.out.println("Pressed "+ input);
        } catch (IOException io) {
            //TODO log
        } finally {
            if (server != null) {
                System.out.println("Shutting down");
                server.shutdownNow();
            }
        }
    }
}