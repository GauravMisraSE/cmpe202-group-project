import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Nitinkumar Gove 
 * @version V1.0
 */
public class MyWorld extends World
{
   Actor bat, haunter, gastly, stillfire, dragon;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);       
        
        bat = HurdleFactory.getHurdle("bat");
        haunter = HurdleFactory.getHurdle("haunter");
        gastly = HurdleFactory.getHurdle("gastly");
        stillfire = HurdleFactory.getHurdle("stillfire");
        dragon = HurdleFactory.getHurdle("dragon");
        
        addObject( bat , 300, 100 ) ;
        addObject( haunter, 300, 200 ) ;
        addObject( gastly , 300, 300 ) ;
        addObject( stillfire, 450, 50 ) ;
        addObject( dragon , 400, 200);
        
        Counter scoreCounter = new Counter("Score: ",(Dragon)dragon);
        addObject(scoreCounter, 60, 80);
    }
    
    public Actor getBat(){
        return bat;
    }
    
    public Actor getDragon(){
        return dragon;
    }
    
}
