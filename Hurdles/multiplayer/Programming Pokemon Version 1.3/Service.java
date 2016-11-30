import com.game.engine.model.Game;
import com.game.engine.model.GamePlayer;
import com.game.engine.model.GamePlayerScore;
import com.game.engine.model.PlayerScore;
import javax.ws.rs.core.Response;
import com.game.http.client.GameServiceClient;
import java.util.*;
import com.game.http.client.util.ServiceUtil;

/**
 * Write a description of class Service here. 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Service  
{
    private static GameServiceClient client = new GameServiceClient("10.250.109.180", 8080);  
    
    public Game gm;
    public GamePlayer gp;    
    public String playerid;
    private static Service service;
          
    
    private Service()
    {
        gm  = new Game(); 
        gp = null;   
    }
    
    public static Service getInstance()
    {
        if(service==null)
        {
            service = new Service();
            return service;
        }
        else
            return service;
    }
    
    public long createGame()
    {
        try{            
         Response response = client.postGame(gm);
         gm = response.readEntity(Game.class);
         System.out.println("New Game ID:" +gm.getGameId());        
         return gm.getGameId();
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
           return 0;
        }         
    }
    
    public String addPlayer(long gameId, String name){
         gp = new GamePlayer(name, gameId);
         Response addPLayerreponse = client.addPlayerToGame(gp);           
         return gp.getPlayerId();
    } 
    
    public void updateScore(int score){
        
       PlayerScore newPlayerScore = new PlayerScore(gp.getPlayerId(), score);       
       GamePlayerScore gamePlayerScore = new GamePlayerScore(gm.getGameId(), newPlayerScore);
       Response updatePlayerScoreResponse = client.updatePlayerScore(gamePlayerScore);
            
      
       
    }
    
     
    public ArrayList<Long>  getAvailableGames(){
            Response response = client.getAll();
		    String allGames = response.readEntity(String.class);		    
		    ArrayList<Long> ids = new ArrayList();		    
		    for (Game g : ServiceUtil.getGameList(allGames)) {
		           System.out.print(g.getGameId()+ " ");	// ###
		           ids.add(g.getGameId());	       
		    } 
		    return ids;		    
    }
    
    
    
    
    
}
