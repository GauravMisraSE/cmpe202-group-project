package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Sushant on 11-11-2016.
 */
@XmlRootElement
public class PlayerScore {
    private String playerId;
    private Long scoreId;

    public PlayerScore() {}

    public PlayerScore(String playerId, Long scoreId) {
        this.scoreId = scoreId;
        this.playerId = playerId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    @Override
    public String toString() {
        return "PlayerScore{" +
                "playerId='" + playerId + '\'' +
                ", scoreId=" + scoreId +
                '}';
    }
}
