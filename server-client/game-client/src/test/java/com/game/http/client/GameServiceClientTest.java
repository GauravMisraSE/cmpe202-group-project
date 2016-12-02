package com.game.http.client;

import com.game.engine.model.Game;
import com.game.engine.model.GamePlayer;
import com.game.engine.model.GamePlayerScore;
import com.game.engine.model.PlayerScore;
import com.game.http.client.util.ServiceUtil;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sushant on 11-11-2016.
 */
public class GameServiceClientTest {
    private static GameServiceClient client = new GameServiceClient("10.250.109.180", 8080);

    public static void main(String[] args) {
        testPostGame();
        //testGetGame();
        //testGetAllGames();
        testGetAllActiveGames();
        //testAddPlayer();
        //testUpdatePlayerScore();
    }

    private static void testPostGame() {
        Game game = new Game();
        List<PlayerScore> playerScoreList = new ArrayList<>();
        playerScoreList.add(new PlayerScore("Sushant", 0));
        game.setPlayerScores(playerScoreList);
        Response response = client.postGame(game);
        Game newGame = response.readEntity(Game.class);
        System.out.println("New Game ID: " +newGame.getGameId());
    }

    private static void testGetAllGames() {
        Response response = client.getAll();
        String allGames = response.readEntity(String.class);
        for (Game game : ServiceUtil.getGameList(allGames)) {
            System.out.print(game.getGameId()+ " ");
        }
    }

    private static void testGetAllActiveGames() {
        Response response = client.getAllActive();
        String allGames = response.readEntity(String.class);
        for (Game game : ServiceUtil.getGameList(allGames)) {
            System.out.print(game.getGameId()+ " ");
        }
    }

    private static void testGetGame() {
        Response response = client.getGame(1L);
        Game game = response.readEntity(Game.class);
        System.out.println("Got game with Game ID: " +game.getGameId());
    }

    private static void testAddPlayer() {
        Game game = new Game();
        Response response = client.postGame(game);
        Game newGame = response.readEntity(Game.class);
        System.out.println("New Game ID: " +newGame.getGameId());
        GamePlayer gamePlayer = new GamePlayer("Sushant", newGame.getGameId());
        Response addPlayerResponse = client.addPlayerToGame(gamePlayer);
        newGame = addPlayerResponse.readEntity(Game.class);
        System.out.println(newGame.getPlayerScores());

    }

    private static void testUpdatePlayerScore() {
        Game game = new Game();
        Response response = client.postGame(game);
        Game newGame = response.readEntity(Game.class);
        System.out.println("New Game ID: " +newGame.getGameId());
        GamePlayer gamePlayer = new GamePlayer("Sushant", newGame.getGameId());
        Response addPlayerResponse = client.addPlayerToGame(gamePlayer);
        String playerScoreString = addPlayerResponse.readEntity(String.class);
        System.out.println(playerScoreString);
        PlayerScore playerScore = new PlayerScore("Sushant", 100);
        GamePlayerScore gamePlayerScore = new GamePlayerScore(newGame.getGameId(), playerScore);
        Response updatePlayerScoreResponse = client.updatePlayerScore(gamePlayerScore);
        String updatedScoreGame = updatePlayerScoreResponse.readEntity(String.class);
        System.out.println(updatedScoreGame);
    }
}