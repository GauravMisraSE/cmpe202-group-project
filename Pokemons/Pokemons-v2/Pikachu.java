import greenfoot.*;  

public class Pikachu extends Actor implements PokeSet1
{
     GifImage myGif= new GifImage("pikachu.gif");
    public void setGif()
    {
    
}
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
