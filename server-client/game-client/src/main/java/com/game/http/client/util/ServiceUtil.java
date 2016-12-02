package com.game.http.client.util;

import com.game.engine.model.Game;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by Sushant on 11-11-2016.
 */
public class ServiceUtil {
    public static List<Game> getGameList(String jsonRep) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Game> games = mapper.readValue(jsonRep,
                    TypeFactory.defaultInstance().constructCollectionType(List.class,
                            Game.class));
            return games;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}