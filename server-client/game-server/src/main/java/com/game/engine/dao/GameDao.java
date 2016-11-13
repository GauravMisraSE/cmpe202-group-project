package com.game.engine.dao;

import com.game.engine.model.Game;

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
}
