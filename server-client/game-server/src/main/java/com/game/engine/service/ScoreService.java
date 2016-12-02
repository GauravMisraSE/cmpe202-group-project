package com.game.engine.service;

import com.game.engine.model.Score;
import com.sun.research.ws.wadl.Response;

import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
public interface ScoreService {

    Score publishScore(Score score);

    List<Score> publishScores(List<Score> scores);

    List<Score> getTopScores(int size);

    Score getScore(long id);

}
