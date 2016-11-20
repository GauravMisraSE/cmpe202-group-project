import greenfoot.*;  

public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(1200, 800, 1);
        addObjects();
        
}


    
    public void addObjects()
    {
        AbstractFactory pokemon= FactoryProducer.getFactory();
        Actor onix= pokemon.getActor("Onix");
        addObject(onix, 200, 200);
        Actor pikachu= pokemon.getActor("Pikachu");
        addObject(pikachu,200,300);
     
    }
}
