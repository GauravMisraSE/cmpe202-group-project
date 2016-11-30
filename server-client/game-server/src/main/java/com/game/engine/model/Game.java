package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.*;

/**
 * Created by Sushant on 06-11-2016.
 */
@XmlRootElement
public class Game {

    private long gameId;
    private List<PlayerScore> playerScores;
    private Date date;

    public Game() {
        this.date = new Date();
        this.playerScores = new ArrayList<>();
    }

    public Game(long gameId) {
        this.gameId = gameId;
        this.date = new Date();
        this.playerScores = new ArrayList<>();
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public List<PlayerScore> getPlayerScores() {
        return playerScores;
    }

    public void setPlayerScores(List<PlayerScore> playerScores) {
        this.playerScores = playerScores;
    }

    public void addPlayerScores(String playerId, Long scoreId) {
        PlayerScore playerScore = new PlayerScore(playerId, scoreId);
        this.playerScores.add(playerScore);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}