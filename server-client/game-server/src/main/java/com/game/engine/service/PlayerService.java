package com.game.engine.service;

import com.game.engine.model.Game;
import com.game.engine.model.Player;

import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
public interface PlayerService {
    Player getPlayer(String playerId);

    Player addPlayer(Player player);
    
    Game getPlayerGame(String playerId, long gameId);

    Game addPlayerGame(String playerId, long gameId);

    List<Game> getPlayerGames(String playerId);

    List<Player> getAllPlayers();
}
