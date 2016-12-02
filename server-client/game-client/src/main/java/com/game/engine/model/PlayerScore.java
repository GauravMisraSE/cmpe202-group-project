package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Sushant on 11-11-2016.
 */
@XmlRootElement
public class PlayerScore {
    private Long playerId;
    private Long scoreId;

    public PlayerScore() {}

    public PlayerScore(Long playerId, Long scoreId) {
        this.scoreId = scoreId;
        this.playerId = playerId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }
}
