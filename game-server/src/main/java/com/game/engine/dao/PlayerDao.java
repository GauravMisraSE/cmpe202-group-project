package com.game.engine.dao;

import com.game.engine.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sushant on 06-11-2016.
 */
public class PlayerDao {
    private static Integer id = 1;
    private static Map<String, Player> players = new HashMap<>();

    public PlayerDao() {
        addPlayer(new Player("Sushant"));
        addPlayer(new Player()); //Anonymous player
    }

    public Player addPlayer(Player player) {
        String playerId = player.getPlayerId();
        if (playerId == null || playerId.isEmpty()) {
            playerId = "Anonymous player " + id++;
            player.setPlayerId(playerId);
        }
        players.put(playerId, player);
        return player;
    }

    public Player getPlayer(String playerId) {
        return players.get(playerId);
    }

    public List<Player> getAllPlayers() {
        return new ArrayList<>(players.values());
    }
}
