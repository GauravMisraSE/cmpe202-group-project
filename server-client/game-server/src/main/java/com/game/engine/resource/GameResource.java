package com.game.engine.resource;

import com.game.engine.model.Game;
import com.game.engine.service.GameService;
import com.game.engine.service.impl.GameServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
@Path("/games")
public class GameResource {
    private static GameService gameService = new GameServiceImpl();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addGame(Game game, @Context UriInfo uriInfo) {
        Game newGame = gameService.addGame(game);
        String newGameId = String.valueOf(newGame.getGameId());
        URI uri = uriInfo.getAbsolutePathBuilder().path(newGameId).build();
        return Response.created(uri)  // created() sets status code to 201 and returns uri in the response header
                .entity(newGame)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Game> getGames() {
        return gameService.getGames();
    }

    @GET
    @Path("/{gameId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Game getGame(@PathParam("gameId") Long gameId) {
        return gameService.getGame(gameId);
    }

    //TODO: Create PUT method to update player scores
}