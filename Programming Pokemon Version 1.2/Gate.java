 import greenfoot.*; 
public class Gate extends Actor
{ //demo for change of stage
   public void act()
   {
    Actor p = getOneIntersectingObject(MovableActor.class);
    if(p!=null)
    {
        Greenfoot.setWorld(new Trial());
    }
   }
}
