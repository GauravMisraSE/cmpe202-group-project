import greenfoot.*;
import java.util.ArrayList;

public class Level01 extends Level
{
   
    GreenfootSound level1Music = new GreenfootSound("level1.mp3");
    boolean musicFlag=true;
     /** ********************      MAP LEGEND     *********************** */
    //      b = block        m = monster         f = floating platform q = wrong door
    //      p = platform     k = key             w = wall   
    //      c = character    d = door            s = score
    public void setFields()
    {
       
        
        map = new String[] { 
            "                         ",
            "                         ",
            "                  z   m  ",
            "                  ppppp  ",
            "                         ",
            "             z           ",
            "            ppp          ",
            "                 ppp     ",
            "             s           ",
            "          pppppp         ",
            "    z                    ",
            " ppppppp            ppp  ",
            "                         ",
            "     s               n   ",
            " c  pppppppp      ppppppp",
            "                         ",
            "              pppp       ",
            "                    ss   ",
            "bbbbbbbbbbbbbbbbbbbbbbbbbb" };
    }

    public void nextLevel()
    {
        Greenfoot.setWorld(new Array()); 
      
    }
     public void act()
    { 
        if(musicFlag==true)
        {
        level1Music.playLoop();
    }        
    }
    public void stopMusic()
    {
        level1Music.stop();
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //System.out.println("inside prepare level 1");
       // Platform2 platform2 = new Platform2();
       // addObject(platform2, 100, 158);
    }
}