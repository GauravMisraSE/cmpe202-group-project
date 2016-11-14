import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platform1 extends Actor
{
    /**
     * Act - do whatever the platform1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()-5,getY());
        }
        if(this.getX()<2){
            getWorld().removeObject(this);
        }
    }    
}
