package com.game.engine.dao;

import com.game.engine.model.Score;
import com.game.engine.util.MapUtil;

import java.util.*;

/**
 * Created by Sushant on 11-11-2016.
 */
public class ScoreDao {
    private static long ID = 1L;
    private static Map<Long, Score> scoreMap = new HashMap<>();

    public Score getScore(Long id) {
        return scoreMap.get(id);
    }

    public Score addScore(Score score) {
        score.setId(ID++);
        scoreMap.put(ID, score);
        return score;
    }

    public List<Score> addScores(List<Score> scores) {
        List<Score> result = new ArrayList<>();
        for (Score score : scores) {
            result.add(addScore(score));
        }
        return result;
    }

    public List<Score> getTopScores(int number) {
        Map<Long, Score> map = MapUtil.sortByValue(scoreMap, true);
        List<Score> scores = new ArrayList<>();
        Object[] keys = map.keySet().toArray();
        number = (keys.length < number) ? keys.length : number;
        for (int i=0; i<number ; i++) {
            scores.add(map.get(keys[i]));
        }
        return scores;
    }

    public List<Score> getScores(long[] scoreIds) {
        List<Score> scores = new ArrayList<>();
        for (Long scoreId: scoreIds) {
            scores.add(scoreMap.get(scoreId));
        }
        return scores;
    }
}

