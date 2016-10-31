import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class walking1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class walking1 extends Actor
{
    /**
     * Act - do whatever the walking1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public GreenfootImage run1 = new GreenfootImage("boyrun1.png");
   public GreenfootImage run2 = new GreenfootImage("boyrun2.png");
   public GreenfootImage run3 = new GreenfootImage("boyrun3.png");
   public GreenfootImage run11 = new GreenfootImage("boyrun11.png");
   public GreenfootImage run12 = new GreenfootImage("boyrun12.png");
   public GreenfootImage run13 = new GreenfootImage("boyrun13.png");
   public GreenfootImage run31 = new GreenfootImage("boyrun31.png");
   public GreenfootImage run32 = new GreenfootImage("boyrun32.png");
   public void act() 
    {
        key();
       
        
    }
   public void key()
    {
        if(Greenfoot.isKeyDown("d"))
        {            
            setRotation(0);
        move(30);
        setImage(run1);
        Greenfoot.delay(10);
        setImage(run2);
        Greenfoot.delay(10);
        setImage(run3);
        Greenfoot.delay(10);
        }
        else if(Greenfoot.isKeyDown("a"))
        {         
            setRotation(0);
        move(-30);
        setImage(run11);
        Greenfoot.delay(10);
        setImage(run12);
        Greenfoot.delay(10);
        setImage(run13);
        Greenfoot.delay(10);
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            setRotation(90);
            move(-10);
        setLocation(getX(),getY()+1);    
            setImage(run31);
        Greenfoot.delay(10);
        setImage(run32);
        Greenfoot.delay(10);  
        
            
            
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setRotation(-90);
            move(-10);
            
               setImage(run31);
        Greenfoot.delay(10);
        setImage(run32);
        Greenfoot.delay(10);
            
         
        }
    }
}