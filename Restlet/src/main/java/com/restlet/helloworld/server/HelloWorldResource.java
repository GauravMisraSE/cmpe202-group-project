package com.restlet.helloworld.server;

/**
 * Created by susha on 28-10-2016.
 */
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 */
public class HelloWorldResource extends ServerResource {

    @Get
    public String represent() {
        return "{\"message\":\"hello, world\"}";
    }

}

