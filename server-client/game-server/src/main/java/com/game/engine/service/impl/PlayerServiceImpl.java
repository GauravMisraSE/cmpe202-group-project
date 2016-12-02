package com.game.engine.service.impl;

import com.game.engine.dao.PlayerDao;
import com.game.engine.model.Game;
import com.game.engine.model.Player;
import com.game.engine.service.GameService;
import com.game.engine.service.PlayerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
public class PlayerServiceImpl implements PlayerService {
    private static GameService gameService = new GameServiceImpl();
    private static PlayerDao dao = new PlayerDao();

    @Override
    public List<Player> getAllPlayers() {
        return dao.getAllPlayers();
    }

    @Override
    public Player getPlayer(String playerId) {
        return dao.getPlayer(playerId);
    }

    @Override
    public Player addPlayer(Player player) {
        return dao.addPlayer(player);
    }

    @Override
    public Game getPlayerGame(String playerId, long gameId) {
        Game game = null;
        Player player = dao.getPlayer(playerId);
        if(player.getGames().contains(gameId)) {
            GameService gameService = new GameServiceImpl();
            game = gameService.getGame(gameId);
        }
        return game;
    }

    @Override
    public Game addPlayerGame(String playerId, long gameId) {
        Game game = gameService.getGame(gameId);
        if(game != null) {
            Player player = dao.getPlayer(playerId);
            player.getGames().add(gameId);
        }
        return game;
    }

    @Override
    public List<Game> getPlayerGames(String playerId) {
        Player player = getPlayer(playerId);
        List<Game> games = new ArrayList<>();
        for (Long gameId: player.getGames()) {
            games.add(gameService.getGame(gameId));
        }
        return games;
    }
}