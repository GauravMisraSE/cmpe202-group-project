import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulbasaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulbasaur extends Movement
{
    GifImage myGif= new GifImage("charmeleon.gif");
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
