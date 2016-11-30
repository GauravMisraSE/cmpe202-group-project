package com.game.engine.dao;

import com.game.engine.model.Game;
import com.game.engine.model.GamePlayerScore;
import com.game.engine.model.PlayerScore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sushant on 06-11-2016.
 */
public class GameDao {
    private static Long id = 1L;
    private static Map<Long, Game> games = new HashMap<>();

    public Game addGame(Game game) {
        game.setGameId(id);
        games.put(id, game);
        id++;
        return game;
    }

    public Game getGame(long gameId) {
        return games.get(gameId);
    }

    public List<Game> getGames() {
        return new ArrayList<>(games.values());
    }

    public Game addPlayerToGame(long gameId, String playerId) {
        Game game = games.get(gameId);
        if (game!= null) {
            List<PlayerScore> playerScores = game.getPlayerScores();
            PlayerScore newPlayerScore = new PlayerScore(playerId, 0);
            playerScores.add(newPlayerScore);
        }
        return game;
    }

    public Game updatePlayerScore(GamePlayerScore gamePlayerScore) {
        Game game = games.get(gamePlayerScore.getGameId());
        if (game!= null) {
            List<PlayerScore> playerScores = game.getPlayerScores();
            for (PlayerScore playerScore : playerScores) {
                if (gamePlayerScore.getPlayerScore().getPlayerId().equals(playerScore.getPlayerId())) {
                    playerScore.setScore(gamePlayerScore.getPlayerScore().getScore());
                    return game;
                }
            }
        }
        return game;
    }


}
