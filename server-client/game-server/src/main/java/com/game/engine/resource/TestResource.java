package com.game.engine.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Sushant on 11-11-2016.
 */
@Path("test")
public class TestResource {
    //http://localhost:8080/engine/test/
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Service is up and running !";
    }
}
