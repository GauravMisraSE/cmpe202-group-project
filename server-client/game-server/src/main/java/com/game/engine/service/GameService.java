package com.game.engine.service;

import com.game.engine.model.Game;
import com.game.engine.model.GamePlayerScore;

import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
public interface GameService {

    Game addGame(Game game);

    List<Game> getGames();

    Game getGame(long gameId);

    Game addPlayerToGame(long gameId, String playerId);

    Game updatePlayerScore(GamePlayerScore gamePlayerScore);

    List<Game> getActiveGames();
}
