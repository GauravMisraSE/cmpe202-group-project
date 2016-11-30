package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
* Created by Sushant on 06-11-2016.
*/
@XmlRootElement
public class Score implements Comparable<Score> {
   private long id;
   private long score;
   private Date date;

   public Score() {}

   public Score(long score, Date date) {
       this.score = score;
       this.date = date;
   }

   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
   }

   public long getScore() {
       return score;
   }

   public void setScore(long score) {
       this.score = score;
   }

   public Date getDate() {
       return date;
   }

   public void setDate(Date date) {
       this.date = date;
   }


   @Override
   public int compareTo(Score o) {
       long comparision =  this.score - o.score;
       if (comparision == 0) {
           comparision = this.date.compareTo(o.date);
       }
       return ((int) comparision);
   }
}