import greenfoot.*;
import java.util.concurrent.ThreadLocalRandom;  
public class Movement extends Actor
{
    public void act() 
    {
        // Add your action code here.
    }    
    public void forward()
    {
        setRotation(0);
        move(1);
    }
    public void backward()
    {
        setRotation(180);
        move(1);
    }
    public void tofro()
    {
        setRotation(90);
        move(5);
        setRotation(270);
        move(3);
    }
    public void rMovement()
    {
       setRotation(ThreadLocalRandom.current().nextInt(0, 359 + 1));
       move(3);       
    }
}
