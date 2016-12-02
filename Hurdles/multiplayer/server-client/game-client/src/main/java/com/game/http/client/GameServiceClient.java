package com.game.http.client;

import com.game.engine.model.Game;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Sushant on 11-11-2016.
 */
public class GameServiceClient extends HttpClient {

    public GameServiceClient(String host, long port) {
        super(host, port);
        customTarget = baseTarget.path("games");
    }

    public Response getGame(long gameId) {
        WebTarget getGameWebTarget = customTarget.path("{gameId}");
        Response response = getGameWebTarget
                .resolveTemplateFromEncoded("gameId", gameId)
                .request(MediaType.APPLICATION_JSON)
                .get();
        return response;
    }

    public Response getAll() {
        Response response = customTarget
                .request(MediaType.APPLICATION_JSON)
                .get();
        return response;
    }

    public Response postGame(Game game) {
        Entity<Game> gameEntity = Entity.json(game);
        Response postResponse = customTarget
                .request(MediaType.APPLICATION_JSON)
                .post(gameEntity);
        return postResponse;
    }
}
