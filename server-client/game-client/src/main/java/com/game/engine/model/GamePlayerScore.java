package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
* Created by Sushant on 29-11-2016.
*/
@XmlRootElement
public class GamePlayerScore {
   private long gameId;
   private PlayerScore playerScore;

   public GamePlayerScore() {
   }

   public GamePlayerScore(long gameId, PlayerScore playerScore) {
       this.gameId = gameId;
       this.playerScore = playerScore;
   }

   public long getGameId() {
       return gameId;
   }

   public void setGameId(long gameId) {
       this.gameId = gameId;
   }

   public PlayerScore getPlayerScore() {
       return playerScore;
   }

   public void setPlayerScore(PlayerScore playerScore) {
       this.playerScore = playerScore;
   }
}