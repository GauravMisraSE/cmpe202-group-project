import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Button here.
 * 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Button extends Actor
{
    String tag = "";
        
    public Button(String t)
    {
        this.tag = t;
    }
   
    public void act() 
    {       
        createButton();
        if (Greenfoot.mouseClicked(this)) {
            System.out.println("button clicked" + tag);
            
            HowToPlayScreen h = new HowToPlayScreen();
            Greenfoot.setWorld(h);
        }
    } 
       
    public void createButton()
    {       
               GreenfootImage drawedImage = new GreenfootImage("playnowsmall.png");
               setImage(drawedImage);     
    }
  
}
