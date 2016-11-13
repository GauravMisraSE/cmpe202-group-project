import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author Nitinkumar Gove 
 * @version V1.1
 */
public class Dragon extends Actor
{
    GifImage gifImage = new GifImage("aerodactyl.gif");
    int flag = 0;
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         setImage(gifImage.getCurrentImage());
         spitFire();
         //move();
    }    
    
    public void move()
    {
        if(getX()>100 && flag == 0)
        {
            setLocation(getX()-5, getY());
            flag = 0;
        }
        else if(getX() < getWorld().getWidth()-100 ) 
        {
            setLocation(getX()+5, getY());
            flag = 1;
        }
        else
            flag = 0;
        
        
        
    }
    
    public void spitFire()
    {
        if(Greenfoot.isKeyDown("space")) 
        {
            getWorld().addObject(new Fire(), getX()-20, getY());
        }
    }
}