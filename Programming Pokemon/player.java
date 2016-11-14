import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    Dragon d=new Dragon();
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right"))
        {
            move(1);
            move(-1);
            count++;
            System.out.println("count is"+count);
            World w=getWorld();
            if (count==10){
                w.addObject(d,450, 50);
            }
            
           if(count%100==0){
                System.out.println("count is"+count);
                w.removeObject(d);
            }
            
        }
       }
    public void showPokemons(){
        
    }  
       
}
