import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Machamp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Machamp extends Actor
{
    /**
     * Act - do whatever the Machamp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif= new GifImage("machamp.gif");
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
