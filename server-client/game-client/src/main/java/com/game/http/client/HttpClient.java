package com.game.http.client;

import org.glassfish.jersey.server.Uri;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

/**
 * Created by Sushant on 11-11-2016.
 */
public abstract class HttpClient {
    private Client client;
    protected WebTarget baseTarget;
    protected WebTarget customTarget;

    public HttpClient(String host, long port) {
        String baseURI = "http://"+host+":"+port+"/engine";
        client = ClientBuilder.newClient();
        baseTarget = client.target(baseURI);
    }
}
