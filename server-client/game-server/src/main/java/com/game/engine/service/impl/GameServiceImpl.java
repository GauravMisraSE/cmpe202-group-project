package com.game.engine.service.impl;

import com.game.engine.dao.GameDao;
import com.game.engine.model.Game;
import com.game.engine.service.GameService;

import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
public class GameServiceImpl implements GameService {

    private static GameDao dao = new GameDao();

    public GameServiceImpl() {
        dao.addGame(new Game());
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
}
