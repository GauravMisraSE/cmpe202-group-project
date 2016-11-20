import greenfoot.*;

public abstract class Level extends World
{
    String[] map;

    public Level()
    {
        super(800, 600, 1);
        AbstractFactory pokemon= FactoryProducer.getFactory();
        //addObject(pokemon.getActor("Pikachu"),200,200);
        //setBackground(new GreenfootImage("StartScreen.png")); // Splash Screen
        setFields();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++) // Example of Iteration
            {
                int kind = "cbpwmdksfq".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Player();
                if (kind == 1) actor = new Block();
                if (kind == 2) actor = new Platform2();
                if (kind == 3) actor = new Wall();
                if (kind == 4) actor = new Monster();
                if (kind == 5) actor = new Door();
                if (kind == 6) actor = pokemon.getActor("Pidgeotto");
                if (kind == 7) actor = new Score();
                if (kind == 8) actor = new Floater();
                if (kind == 9) actor = pokemon.getActor("Pikachu");
                
                addObject(actor, 16+j*32, 16+i*32);
        }
    }

    public void setFields() {}

    public void nextLevel() {}
}