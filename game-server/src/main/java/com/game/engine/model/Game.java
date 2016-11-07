package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sushant on 06-11-2016.
 */
@XmlRootElement
public class Game {

    private long gameId;
    private Map<Long, Long> playerScores;
    private Date date;

    public Game() {
        this.date = new Date();
        this.playerScores = new HashMap<>();
    }

    public Game(long gameId) {
        this.gameId = gameId;
        this.date = new Date();
        this.playerScores = new HashMap<>();
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public Map<Long, Long> getPlayerScores() {
        return playerScores;
    }

    public void setPlayerScores(Map<Long, Long> playerScores) {
        this.playerScores = playerScores;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}