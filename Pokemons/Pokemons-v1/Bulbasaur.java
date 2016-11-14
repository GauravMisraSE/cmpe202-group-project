import greenfoot.*; 
import java.util.concurrent.ThreadLocalRandom;   // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulbasaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulbasaur extends Actor
{
    GifImage myGif= new GifImage("charmeleon.gif");
    public void act() 
    {
        setImage(myGif.getCurrentImage());
        //move(1);
        rMovement();
        //tofro();
        
        
    }    
    public void rMovement()
    {
        move(3); 
       if(Greenfoot.getRandomNumber(20)==1)
       setRotation(ThreadLocalRandom.current().nextInt(0, 359 + 1));      
    }
    public void tofro()
    {
        setRotation(90);
        move(5);
        setRotation(270);
        move(5);
    }
}
