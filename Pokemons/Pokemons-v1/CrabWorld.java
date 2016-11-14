import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(1200, 800, 1); 
        addObjects();
    }
    public void addObjects()
    {
        Bulbasaur b1= new Bulbasaur();
        addObject(b1, 200, 200);
        Mrmime m1= new Mrmime();
        addObject(m1, 300,400);
    }
}
