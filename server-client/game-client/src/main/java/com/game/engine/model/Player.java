package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sushant on 06-11-2016.
 */
@XmlRootElement
public class Player {

    private String playerId;
    private Set<Long> games;
    private Date lastPlayed;
    private Date firstPlayed;


    public Player() {
        this.games = new HashSet<>();
    }

    public Player(String playerId) {
        this.playerId = playerId;
        this.games = new HashSet<>();
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @XmlTransient
    public Set<Long> getGames() {
        return games;
    }

    public void setGames(Set<Long> games) {
        this.games = games;
    }


    public Date getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(Date lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    public Date getFirstPlayed() {
        return firstPlayed;
    }

    public void setFirstPlayed(Date firstPlayed) {
        this.firstPlayed = firstPlayed;
    }
}
