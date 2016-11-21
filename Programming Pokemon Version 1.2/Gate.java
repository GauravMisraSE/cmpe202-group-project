 import greenfoot.*; 
public class Gate extends Actor
{
   public void act()
   {
    Actor p = getOneIntersectingObject(MovableActor.class);
    if(p!=null)
    {
        Greenfoot.setWorld(new Trial());
    }
   }
}
