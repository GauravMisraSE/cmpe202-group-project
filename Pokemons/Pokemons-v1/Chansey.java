import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chansey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chansey extends Actor
{
    /**
     * Act - do whatever the Chansey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif= new GifImage("chansey.gif");
    public void act() 
    {
       setImage(myGif.getCurrentImage());
    }    
}
