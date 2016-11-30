import greenfoot.*;
/**
 * Write a description of class JumpState here.
 * 
 * @author Sushant Vairagade 
 * @version 2016-11-18
 */
public class JumpState implements ActorState
{
    private MovableActor actor;
    //private static final Integer SPEED = 10;
    //private static Integer imageIndex = 0;
    private GreenfootImage faceForward = new GreenfootImage("forward4.png");
    private GreenfootImage faceBackward = new GreenfootImage("backward4.png");
    private static final Integer JUMP_HEIGHT = 150;
    private static final Integer JUMP_SPEED = 2;
    private static final Integer GRAVITY = 5;

    /**
     * Constructor for objects of class GroundState
     */
    public JumpState(MovableActor actor)
    {
        this.actor = actor;
    }

    public void move()
    {
        int y = actor.getY();
        //Rising up
        while(actor.getY() > y - JUMP_HEIGHT) {
            Greenfoot.delay(1);
            if(Greenfoot.isKeyDown("d"))
            {
                actor.setLastAction("d");
                actor.setImage(faceForward);
                actor.setLocation(actor.getX() + JUMP_SPEED, actor.getY() - GRAVITY);
            }
            else if(Greenfoot.isKeyDown("a"))
            {
                actor.setLastAction("a");
                actor.setImage(faceBackward);
                actor.setLocation(actor.getX() - JUMP_SPEED, actor.getY() - GRAVITY);
            }
            else {
                actor.setLocation(actor.getX(), actor.getY() - GRAVITY);
            }
        }
        actor.setActorState(actor.getFallState());
    }
}