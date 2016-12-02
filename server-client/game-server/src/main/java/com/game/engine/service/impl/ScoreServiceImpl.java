package com.game.engine.service.impl;

import com.game.engine.dao.ScoreDao;
import com.game.engine.model.Score;
import com.game.engine.service.ScoreService;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Sushant on 11-11-2016.
 */
public class ScoreServiceImpl implements ScoreService {

    private static ScoreDao dao = new ScoreDao();

    @Override
    public Score publishScore(Score score) {
        return dao.addScore(score);
    }

    @Override
    public List<Score> publishScores(List<Score> scores) {
        return dao.addScores(scores);
    }

    @Override
    public List<Score> getTopScores(int size) {
        return dao.getTopScores(size);
    }

    @Override
    public Score getScore(long id) {
        return dao.getScore(id);
    }
}
