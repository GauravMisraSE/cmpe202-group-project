import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ponyta extends Actor
{
    /**
     * Act - do whatever the Ponyta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif= new GifImage("ponyta.gif");
    public void act() 
    {
       setImage(myGif.getCurrentImage()); 
    }    
}
