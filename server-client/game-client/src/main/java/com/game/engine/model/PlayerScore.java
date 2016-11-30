package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
* Created by Sushant on 11-11-2016.
*/
@XmlRootElement
public class PlayerScore {
   private String playerId;
   private int score;

   public PlayerScore() {}

   public PlayerScore(String playerId, int score) {
       this.playerId = playerId;
       this.score = score;
   }

   public String getPlayerId() {
       return playerId;
   }

   public void setPlayerId(String playerId) {
       this.playerId = playerId;
   }

   public int getScore() {
       return score;
   }

   public void setScore(int score) {
       this.score = score;
   }
}