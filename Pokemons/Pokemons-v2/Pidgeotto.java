import greenfoot.*;  

public class Pidgeotto extends Actor implements PokeSet1
{
    GifImage myGif= new GifImage("pidgeotto.gif");
    public void setGif()
    {
    
    }
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
