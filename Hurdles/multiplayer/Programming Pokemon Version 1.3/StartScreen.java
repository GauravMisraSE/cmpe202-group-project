import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class StartScreen here.
 * 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class StartScreen extends World
{
    
    Button createGame, joinGame;
    
    /**
     * Constructor for objects of class StartScreen. 
     */
    Service service;
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(800, 600, 1); 
        
        createGame = new Button("createnewgame");
        joinGame = new Button("joingame");
        
        this.setBackground(new GreenfootImage("poke2.jpg"));
        this.addObject(createGame, 400, 250 ) ;
        this.addObject(joinGame, 400, 320 ) ;
                        
        service = Service.getInstance();
               
        // long gm = service.createGame();
        // ArrayList<Long> glist = service.getAvailableGames();
        
        // add a player to a game
        // String myid = service.addPlayer(gm, "Sagar");
        // System.out.println("myid " + myid);
        
        // update my score
        // service.updateScore(100);
        // service.updateScore(200);
        // service.updateScore(300);     
        
    }
    public void act() 
    {       
        if (Greenfoot.mouseClicked(createGame) ) {
         System.out.println("create game");
         HowToPlay h = new HowToPlay();
         Greenfoot.setWorld(h);  
         
         // long gm = service.createGame();
         
        }
        
        if(Greenfoot.mouseClicked(joinGame)){
        System.out.println("join game");
        
        // ArrayList<Long> glist = service.getAvailableGames();
        // add a player to a game
        // String myid = service.addPlayer(gm, "Sagar");
        
        }
    } 
 
}
