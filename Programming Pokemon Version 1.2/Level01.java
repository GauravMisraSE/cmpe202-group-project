import greenfoot.*;

public class Level01 extends Level
{
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        m = monster         f = floating platform q = wrong door
    //      p = platform     k = key             w = wall   
    //      c = character    d = door            s = score
    GreenfootImage gates = new GreenfootImage("gate.jpg");
    public void setFields()
    {
        System.out.println("level 1 set fields");
        map = new String[] { 
            "                         ",
            "                         ",
            "                         ",
            "                         ",
            "                         ",
            "                         ",
            "                         ",
            "                         ",
            "                         ",
            "          pppppp         ",
            "                         ",
            " ppppppp         pppppppp",
            "                         ",
            "  c                       ",
            "    pppppppp   ppppppp   ",
            "                         ",
            "             ppppp       ",
            "                       m ",
            "bbbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    public void act()
    {
        
    }
    public void nextLevel()
    {
        //Greenfoot.setWorld(new Level2()); 
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        System.out.println("inside prepare level 1");
       // Platform2 platform2 = new Platform2();
       // addObject(platform2, 100, 158);
    }
    
}