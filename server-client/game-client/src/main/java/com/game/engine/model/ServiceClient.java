package com.game.engine.model;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import com.game.http.client.GameServiceClient;
import com.game.http.client.util.ServiceUtil;

public class ServiceClient {
	  private static GameServiceClient client = new GameServiceClient("10.250.109.180", 8080);
	public static void main(String a[])
	{
		try{
						
			// create 2 games - game #1
			
			Game game = new Game();  		         
		    Response response = client.postGame(game);
		    Game newGame = response.readEntity(Game.class);
		    System.out.println("New Game ID: " +newGame.getGameId());	
			
		    // game #2 - create a game and add new players to it
		    
		    game = new Game();  		         
		    response = client.postGame(game);
		    newGame = response.readEntity(Game.class);
		    System.out.println("New Game ID: " +newGame.getGameId());
		    
		    GamePlayer gamePlayer = new GamePlayer("Gove", newGame.getGameId());
	        Response addPLayerreponse = client.addPlayerToGame(gamePlayer);
	           
	        gamePlayer = new GamePlayer("Rohit", newGame.getGameId());
	        addPLayerreponse = client.addPlayerToGame(gamePlayer);
	        
	        gamePlayer = new GamePlayer("Sumit", newGame.getGameId());
	        addPLayerreponse = client.addPlayerToGame(gamePlayer);
	        
	        gamePlayer = new GamePlayer("Sagar", newGame.getGameId());
	        addPLayerreponse = client.addPlayerToGame(gamePlayer);
	        
	        PlayerScore playerScore = new PlayerScore(gamePlayer.getPlayerId(), 100);
	        GamePlayerScore gamePlayerScore = new GamePlayerScore(newGame.getGameId(), playerScore);
	        Response updatePlayerScoreResponse = client.updatePlayerScore(gamePlayerScore);
	        PlayerScore updatedScoreGame = updatePlayerScoreResponse.readEntity(PlayerScore.class);
	        System.out.println(updatedScoreGame.getScore());
	        
	        newGame = addPLayerreponse.readEntity(Game.class);
	        System.out.println(newGame.getPlayerScores());
		    
		    // get all games 
	        
		    response = client.getAll();
		    String allGames = response.readEntity(String.class);
		    
		    ArrayList<Integer> ids = new ArrayList(); 
		    
		    for (Game g : ServiceUtil.getGameList(allGames)) {
		           System.out.print(g.getGameId()+ " ");	
		           ids.add((int) g.getGameId());	       
		    }       
		    
		    System.out.println("\nTotal Games Available " + ids.size());        
		    
		    // update score
		    
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	/**
	 * this function returns a unique username for the player
	 * @param sname - user name - raw
	 * @return formatted user name
	 * @throws UnknownHostException
	 * @throws SocketException
	 */
	public static String getPlayerName(String sname) throws UnknownHostException, SocketException
	{
		String mac = getMacAddress();
		String [] parts = mac.split("-");
		return sname + parts[0]+parts[1]+parts[2];
	}
		
	/**
	 * this function returns the mac address of current system
	 * @return MAC address
	 * @throws UnknownHostException
	 * @throws SocketException
	 */
	public static String getMacAddress() throws UnknownHostException, SocketException{
		
		InetAddress ip;
		ip = InetAddress.getLocalHost();
		String name = ip.getHostName();
		System.out.println(name);
		
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
		byte[] mac = network.getHardwareAddress();
		
	    StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
		}
		
		return sb.toString();
		
	}

}
