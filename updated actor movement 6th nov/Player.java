import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int speed = 10;
     int superspeed=70;
     int i = 0;
     String key = "d";
     public GreenfootImage  runForward[] = new GreenfootImage[]{new GreenfootImage("walkforward1.png"), new GreenfootImage("walkforward2.png"), new GreenfootImage("walkforward3.png"), 
                                                                new GreenfootImage("walkforward4.png"),new GreenfootImage("walkforward5.png"),new GreenfootImage("walkforward6.png")};
                                                                
     public GreenfootImage faceForward = new GreenfootImage("standingforward.png");
     
     public GreenfootImage runBackward[] = new GreenfootImage[]{new GreenfootImage("walkingbackward1.jpg"), new GreenfootImage("walkingbackward2.jpg"), new GreenfootImage("walkingbackward3.jpg"),
                                                                new GreenfootImage("walkingbackward4.jpg"),new GreenfootImage("walkingbackward5.jpg"),new GreenfootImage("walkingbackward6.jpg")};
                                                                
     public GreenfootImage faceBackward = new GreenfootImage("standingbackward.jpg");
public void act() 
        {
            movement();
        }   
private void movement() {
        while(Greenfoot.isKeyDown("d"))
        {                
            updateActorMovement("d", speed, runForward, 5);
        }
        while(Greenfoot.isKeyDown("a"))
        {                
            updateActorMovement("a", -speed, runBackward, 5);
        }        
            setLastPosition();
}
private void updateActorMovement(String keyPressed, int speed, GreenfootImage[] images, int delay) {
            setLocation(getX()+speed,getY());
            setImage(images[i]);
            Greenfoot.delay(10);
            i= (i+1)%images.length;
            key = keyPressed;
   }
private void setLastPosition() {
        if( key =="d")
        {
            setImage(faceForward);
        }
        else if ( key =="a")
        {
            setImage(faceBackward);
        }    
    }
}