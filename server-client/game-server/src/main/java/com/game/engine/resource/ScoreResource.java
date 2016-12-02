package com.game.engine.resource;

import com.game.engine.model.Score;
import com.game.engine.service.ScoreService;
import com.game.engine.service.impl.ScoreServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Sushant on 11-11-2016.
 */
@Path("/scores")
public class ScoreResource {
    private static ScoreService scoreService = new ScoreServiceImpl();

    @GET
    @Path("/top/{size}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Score> getTopScores(@PathParam("size") Integer size) {
        return scoreService.getTopScores(size);
    }

    @GET
    @Path("/{scoreId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Score getScore(@PathParam("scoreId") Long scoreId) {
        return scoreService.getScore(scoreId);
    }

    /*@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Score> publishScores(List<Score> scores) {
        List<Score> addedScores = scoreService.publishScores(scores);
        return addedScores;
    }*/

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Score publishScore(Score score) {
        Score addedScore = scoreService.publishScore(score);
        return addedScore;
    }
}
