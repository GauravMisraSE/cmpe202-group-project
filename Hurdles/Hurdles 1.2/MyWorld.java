import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Nitinkumar Gove 
 * @version V1.0
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);         
        // addObject( new Bat(), 300, 100 ) ;
         addObject( new Haunter(), 300, 200 ) ;
         addObject( new Gastly(), 300, 300 ) ;
        addObject( new Dragon(), 450, 50 ) ;
        // addObject( new Fire(), 400, 300);
    }
}
