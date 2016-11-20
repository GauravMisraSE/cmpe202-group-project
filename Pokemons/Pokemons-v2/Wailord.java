import greenfoot.*;  


public class Wailord extends Actor implements PokeSet1
{
    GifImage myGif= new GifImage("wailord.gif");
    public void setGif()
    {}
    

    public void act() 
    {
        // Add your action code here.
        setImage(myGif.getCurrentImage());
    }    
}
