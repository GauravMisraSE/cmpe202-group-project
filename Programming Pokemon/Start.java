import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
   
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 350, 1);
        
        Greenfoot.setWorld(this);

    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            System.out.println("Game Started");
            Greenfoot.setWorld(new MyWorld("world.png"));
            
        }
    }
}
