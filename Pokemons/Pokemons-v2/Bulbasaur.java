import greenfoot.*; 
import java.util.concurrent.ThreadLocalRandom;   

public class Bulbasaur extends Actor implements PokeSet1
{
    GifImage myGif= new GifImage("charmeleon.gif");
    public void setGif()
    {
    
     }
public void act() 
    {
        setImage(myGif.getCurrentImage());
        //move(1);
        rMovement();
        //tofro();
        
        
    }    
    public void rMovement()
    {
        move(3); 
       if(Greenfoot.getRandomNumber(20)==1)
       setRotation(ThreadLocalRandom.current().nextInt(0, 359 + 1));      
    }
    public void tofro()
    {
        setRotation(90);
        move(5);
        setRotation(270);
        move(5);
    }
}
