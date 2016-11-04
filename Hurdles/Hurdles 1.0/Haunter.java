import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Haunter here.
 * 
 * @author Nitinkumar Gove
 * @version V1.0
 */
public class Haunter extends Actor
{
    
    GifImage gifImage = new GifImage("haunter.gif");
     
    /**
     * Act - do whatever the Haunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(gifImage.getCurrentImage()); 
        
        // movement
        
        // detect left key - and act
        if(Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        }
        
        // detect right key - and act
        if(Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        
        // detect up key - and act
        if(Greenfoot.isKeyDown("up"))
        {
            moveUp();
        }
        
         // detect down key - and act
        if(Greenfoot.isKeyDown("down"))
        {
            moveDown();
        }
    } 
    
    
    public void moveRight()
    {
        int x = (getX() + 5);
        int y = (getY());
         
        setLocation(x, y);
    }
    public void moveLeft()
    {
        int x = (getX() - 5);
        int y = (getY());
         
        setLocation(x, y);
    }
    public void moveDown()
    {
        int x = (getX());
        int y = (getY() + 5);
         
        setLocation(x, y);
    }
    public void moveUp()
    {
        int x = (getX());
        int y = (getY() - 5);
         
        setLocation(x, y);
    }
}
