package com.game.http.client;

import com.game.engine.model.Game;
import com.game.engine.model.GamePlayer;
import com.game.engine.model.GamePlayerScore;

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

    public Response addPlayerToGame(GamePlayer gamePlayer) {
        Entity gameEntity = Entity.json(gamePlayer);
        Response postResponse = customTarget
                .path("addPlayer")
                .request(MediaType.APPLICATION_JSON)
                .post(gameEntity);
        return postResponse;
    }

    public Response updatePlayerScore(GamePlayerScore gamePlayerScore) {
        Entity gamePlayerScoreEntity = Entity.json(gamePlayerScore);
        Response putResponse = customTarget
                .path("updateScore")
                .request(MediaType.APPLICATION_JSON)
                .put(gamePlayerScoreEntity);
        return putResponse;
    }
}