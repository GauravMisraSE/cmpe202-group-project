import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wailord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wailord extends Actor
{
    /**
     * Act - do whatever the Wailord wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif= new GifImage("wailord.gif");
    public void act() 
    {
        // Add your action code here.
        setImage(myGif.getCurrentImage());
    }    
}
