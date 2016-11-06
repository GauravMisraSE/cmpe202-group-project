import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Fire extends Actor
{
    private int speed = 5;
    GifImage gifImage = new GifImage("fire.gif");
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         setImage(gifImage.getCurrentImage());
         
         setLocation(getX() - speed, getY()+5);
         checkBoundaries();
    }  
    
    //we add a method "checkBoundaries()" that destroys bullets that are off screen.
   public void checkBoundaries()
   {
       try
       {
           if(getX() > getWorld().getWidth() - 5) 
                getWorld().removeObject(this);
           else if(getX() < 5) 
                getWorld().removeObject(this);
           if(getY() > getWorld().getHeight() - 5) 
                getWorld().removeObject(this);
           else if(getY() < 5) 
                getWorld().removeObject(this);
       }
       catch(Exception e)
       {
          System.out.println(e.toString()); 
       }
   }
   //"destroyEnemies()" destroys enemies.
   public void destroyEnemies()
   {
       //"Enemy" can be any class that you want the bullet to destroy. 
       /* 
       Actor enemy = getOneIntersectingObject(Enemy.class);
       if(enemy != null) {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       } */
   }
}
