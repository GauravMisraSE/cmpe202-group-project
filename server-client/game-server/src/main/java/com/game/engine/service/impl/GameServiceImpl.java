package com.game.engine.service.impl;

import com.game.engine.dao.GameDao;
import com.game.engine.model.Game;
import com.game.engine.model.GamePlayerScore;
import com.game.engine.service.GameService;

import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
public class GameServiceImpl implements GameService {

    private static GameDao dao = new GameDao();

    public GameServiceImpl() {
        Game game = new Game();
        //game.addPlayerScores("Sushant", 1L);
        dao.addGame(game);
        dao.addGame(new Game());
    }

    @Override
    public Game addGame(Game game) {
        return dao.addGame(game);
    }


    @Override
    public List<Game> getGames() {
        return dao.getGames();
    }

    @Override
    public Game getGame(long gameId) {
        return dao.getGame(gameId);
    }

    @Override
    public Game addPlayerToGame(long gameId, String playerId) {
        return dao.addPlayerToGame(gameId, playerId);
    }

    @Override
    public Game updatePlayerScore(GamePlayerScore gamePlayerScore) {
        return dao.updatePlayerScore(gamePlayerScore);
    }


}
