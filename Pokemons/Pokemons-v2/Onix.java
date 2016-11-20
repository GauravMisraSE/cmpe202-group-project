import greenfoot.*;  

public class Onix extends Actor implements PokeSet1
{
    public void setGif()
    {  }
    GifImage myGif= new GifImage("onix.gif");

    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
