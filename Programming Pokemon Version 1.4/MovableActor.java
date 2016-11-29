import greenfoot.*;

/**
 * Write a description of class MovableActor here.
 * 
 * @author Sushant Vairagade 
 * @version 2016-11-18
 */
public class MovableActor extends Actor
{
    // instance variables - replace the example below with your own
    private ActorState actorState;
    private GroundState groundState;
    private JumpState jumpState;
    private FallState fallState;
    private String lastAction;

    /**
     * Constructor for objects of class MovableActor
     */
    public MovableActor()
    {
        groundState = new GroundState(this);
        jumpState = new JumpState(this);
        fallState = new FallState(this);
        actorState = fallState;
        setImage(new GreenfootImage("standingforward.png"));
        lastAction = "d";
    }
    
    public void setActorState(ActorState actorState) 
    {
        this.actorState = actorState;
    }
    
    public ActorState getGroundState() {
        return groundState;
    }
    
    public ActorState getJumpState() {
        return jumpState;
    }
    
    public ActorState getFallState() {
        return fallState;
    }
    
    public void setLastAction(String lastAction)
    {
        this.lastAction= lastAction;
    }
    
    public String getLastAction() 
    {
        return lastAction;
    }
    
    public boolean onGround()
    {   
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        return platform != null;
    }
    
    public boolean touchingPlatform()
    {   
        Actor platform = getOneIntersectingObject(Platform2.class);
        return platform != null;
    }
    
    public boolean onThePlatform()
    {   
        Actor platform = getOneIntersectingObject(Platform2.class);
        if (platform != null)
        {
            if(platform.getY() < getY()) {
                return true;
            }
        }
        return false;
    }
    
    public void act() {
        actorState.move();
        checkNext();
    }
    public void checkNext(){
      Actor door=getOneObjectAtOffset(0, 0, Door.class);
      //System.out.println(door);
      if(door!=null){
          System.out.println("Check door");
        ((Level)getWorld()).nextLevel();
       }
      
    }
}
