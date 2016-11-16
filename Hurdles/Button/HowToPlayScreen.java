import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlayScreen here.
 * 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class HowToPlayScreen extends MyWorld
{

    /**
     * Constructor for objects of class HowToPlayScreen.
     * 
     */
    public HowToPlayScreen()
    {
        
        this.setBackground(new GreenfootImage("instructions.png"));
        this.removeObject(getObjects(Button.class).get(0));
        
        
    }
}
