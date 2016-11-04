import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gastly here.
 * 
 * @author Nitinkumar Gove
 * @version V1.0
 */
public class Gastly extends Actor
{
    GifImage gifImage = new GifImage("gastly.gif");
    
    /**
     * Act - do whatever the Gastly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(gifImage.getCurrentImage()); 
    }    
}
