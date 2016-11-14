import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mrmime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mrmime extends Actor
{
    /**
     * Act - do whatever the Mrmime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif= new GifImage("mr-mime.gif");
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
