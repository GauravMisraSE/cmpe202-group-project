import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pidgeotto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pidgeotto extends Actor
{
    /**
     * Act - do whatever the Pidgeotto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif= new GifImage("pidgeotto.gif");
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
