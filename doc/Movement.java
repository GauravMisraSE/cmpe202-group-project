import greenfoot.*;
import java.util.concurrent.ThreadLocalRandom;  
public class Movement extends Actor
{
    public void act() 
    {
        // Add your action code here.
    }    
    public void forward(int count)
    {
        setRotation(0);
        move(count);
    }
    public void backward(int count)
    {
        setRotation(180);
        move(count);
    }
    public void tofro(int forward, int backward)
    {
        setRotation(90);
        for(int i=0; i<=forward; i++)
        move(1);
        setRotation(270);
        for(int i=0; i<=backward; i++)
        move(1);
    }
    public void rMovement(int movecount)
    {
       setRotation(ThreadLocalRandom.current().nextInt(0, 359 + 1));
       move(movecount);       
    }
}
