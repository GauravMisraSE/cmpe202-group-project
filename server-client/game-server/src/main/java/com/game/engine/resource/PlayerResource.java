package com.game.engine.resource;

import com.game.engine.model.Game;
import com.game.engine.model.Player;
import com.game.engine.service.PlayerService;
import com.game.engine.service.impl.PlayerServiceImpl;

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

@Path("/players")
public class PlayerResource {
    private PlayerService playerService = new PlayerServiceImpl();

    @GET
    @Path("/{playerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayer(@PathParam("playerId") String playerId) {
        return playerService.getPlayer(playerId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayers() {
        return playerService.getAllPlayers();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPlayer(Player player, @Context UriInfo uriInfo) {
        Player newPlayer = playerService.addPlayer(player);
        String newUserId = newPlayer.getPlayerId();
        URI uri = uriInfo.getAbsolutePathBuilder().path(newUserId).build();
        return Response.created(uri)  // created() sets status code to 201 and returns uri in the response header
                .entity(newPlayer)
                .build();
    }


    @PUT
    @Path("/{playerId}/games/{gameId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Game addPlayerGame(@PathParam("playerId") String playerId, @PathParam("gameId") long gameId) {
        Game game = playerService.addPlayerGame(playerId, gameId);
        return game;
    }

    @GET
    @Path("/{playerId}/games/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Game> getPlayerGames(@PathParam("playerId") String playerId) {
        List<Game> games = playerService.getPlayerGames(playerId);
        return games;
    }

    @GET
    @Path("/{playerId}/games/{gameId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Game getPlayerGame(@PathParam("playerId") String playerId, @PathParam("gameId") long gameId) {
        Game game = playerService.getPlayerGame(playerId, gameId);

        return game;
    }
}
