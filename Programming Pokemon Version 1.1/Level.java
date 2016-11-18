import greenfoot.*;

public abstract class Level extends World
{
    String[] map;

    public Level()
    {
        super(800, 600, 1);
        //setBackground(new GreenfootImage("StartScreen.png")); // Splash Screen
        setFields();
        System.out.println(map.length);
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++) // Example of Iteration
        {
                int kind = "cbpwmdksfq".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if(kind==0) actor=new MovableActor();
                if (kind == 1) actor = new Block();
                if (kind == 2) actor = new Platform2();
                if (kind == 3) actor = new Wall();
                addObject(actor, 16+j*32, 16+i*32);
        }
    }

    public void setFields() {
        System.out.println("level set fields");
    }

    public void nextLevel() {}
}