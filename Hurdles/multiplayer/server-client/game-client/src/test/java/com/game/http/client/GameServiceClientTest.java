package com.game.http.client;

import com.game.engine.model.Game;
import com.game.engine.model.PlayerScore;
import com.game.http.client.util.ServiceUtil;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sushant on 11-11-2016.
 */
public class GameServiceClientTest {
    private static GameServiceClient client = new GameServiceClient("localhost", 8080);

    public static void main(String[] args) {
        testPostGame();
        testGetGame();
        testGetAllGames();
    }

    private static void testPostGame() {
        Game game = new Game();
        List<PlayerScore> playerScoreList = new ArrayList<>();
        playerScoreList.add(new PlayerScore(1L, 0L));
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

    private static void testGetGame() {
        Response response = client.getGame(1L);
        Game game = response.readEntity(Game.class);
        System.out.println("Got game with Game ID: " +game.getGameId());
    }
}