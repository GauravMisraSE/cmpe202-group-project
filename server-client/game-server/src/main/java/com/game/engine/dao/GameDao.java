package com.game.engine.dao;

import com.game.engine.model.Game;
import com.game.engine.model.GamePlayerScore;
import com.game.engine.model.PlayerScore;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Sushant on 06-11-2016.
 */
public class GameDao {
    private static Long id = 1L;
    private static Map<Long, Game> games = new HashMap<>();
    private static Map<Long, Game> activeGames = new HashMap<>();

    public Game addGame(Game game) {
        if (activeGames.size() < 5) {
            game.setGameId(id);
            games.put(id, game);
            activeGames.put(id, game);
            id++;
            return game;
        } else {
            return null;
        }
    }

    public Game getGame(long gameId) {
        return games.get(gameId);
    }

    public List<Game> getGames() {
        return new ArrayList<>(games.values());
    }

    public List<Game> getActiveGames() {
        return new ArrayList<>(activeGames.values());
    }

    public Game addPlayerToGame(long gameId, String playerId) {
        Game game = games.get(gameId);
        if (game != null) {
            List<PlayerScore> playerScores = game.getPlayerScores();
            PlayerScore newPlayerScore = new PlayerScore(playerId, -1);
            playerScores.add(newPlayerScore);
        }
        return game;
    }

    public Game updatePlayerScore(GamePlayerScore gamePlayerScore) {
        int playersDone = 0;
        Game game = games.get(gamePlayerScore.getGameId());
        if (game != null) {
            List<PlayerScore> playerScores = game.getPlayerScores();
            for (PlayerScore playerScore : playerScores) {
                if (playerScore.getScore() > 0) {
                    playersDone++;
                }
                if (gamePlayerScore.getPlayerScore().getPlayerId().equals(playerScore.getPlayerId())) {
                    playerScore.setScore(gamePlayerScore.getPlayerScore().getScore());
                    playersDone++;
                }
            }
        }
        System.out.println(GameDao.class.getCanonicalName() +" Players done "+ playersDone);
        if (playersDone == 4) {
            //System.out.println(GameDao.class.getCanonicalName() +" removing game "+ game.getGameId() +" as Players done "+ playersDone);
            activeGames.remove(game.getGameId());
        }
        return game;
    }

}