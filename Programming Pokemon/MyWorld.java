import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private GreenfootImage bg;
    private GreenfootImage bgImage,bgBase;
    private int picWidth;
    private double scrollSpeed;
    private int scrollPosition = 0;
    private int count=0;
    public MyWorld(String bg)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 350, 1);
        System.out.println("MyWorld constructor"+bg);
        picWidth = (new GreenfootImage(bg)).getWidth();
        scrollSpeed = 6;
        Greenfoot.setSpeed(40);
        setBackground(new GreenfootImage(".\\images\\"+bg));
        
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
        
        Player p=new Player();
        addObject(p,45,280);
        
    }
    public void act(){
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        if(Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("down")){
            repaint(scrollPosition);
    }
        
    
    }
    
     private void repaint(int position)
    {
        count++;
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
    
}
