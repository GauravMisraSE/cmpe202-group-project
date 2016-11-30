package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Sushant on 29-11-2016.
 */
@XmlRootElement
public class GamePlayer {

    private String playerId;
    private long gameId;

    public GamePlayer() {
    }

    public GamePlayer(String playerId, long gameId) {
        this.playerId = playerId;
        this.gameId = gameId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }
}
