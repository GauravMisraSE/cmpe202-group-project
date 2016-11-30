package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Sushant on 06-11-2016.
 */
@XmlRootElement
public class Game {

    private long gameId;
    private List<com.game.engine.model.PlayerScore> playerScores;
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

    public List<com.game.engine.model.PlayerScore> getPlayerScores() {
        return playerScores;
    }

    public void setPlayerScores(List<com.game.engine.model.PlayerScore> playerScores) {
        this.playerScores = playerScores;
    }

    public void addPlayerScores(String playerId, Long scoreId) {
        com.game.engine.model.PlayerScore playerScore = new PlayerScore(playerId, scoreId);
        this.playerScores.add(playerScore);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}