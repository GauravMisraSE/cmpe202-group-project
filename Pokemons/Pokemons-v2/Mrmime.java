import greenfoot.*;  


public class Mrmime extends Actor implements PokeSet1
{
    GifImage myGif= new GifImage("mr-mime.gif");
    public void setGif()
    {
    
    }
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
