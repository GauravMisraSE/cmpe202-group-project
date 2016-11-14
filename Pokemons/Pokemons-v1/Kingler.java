import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kingler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kingler extends Actor
{
    /**
     * Act - do whatever the Kingler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif= new GifImage("kingler.gif");
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
