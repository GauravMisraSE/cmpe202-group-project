package com.game.engine.service;

import com.game.engine.model.Score;

/**
 * Created by Sushant on 06-11-2016.
 */
public interface ScoreService {

    Score publishScore(Score score);

    Score getTopScores(int size);

    Score getScore(long id);

    Score removeScore(long id);

}
