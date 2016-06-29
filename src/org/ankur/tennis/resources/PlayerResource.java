package org.ankur.tennis.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.ankur.tennis.model.Player;
import org.ankur.tennis.service.PlayerService;

@Path("/players")
public class PlayerResource {

	PlayerService playerService = new PlayerService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Player> getPlayers(@QueryParam("category") String category, @QueryParam("rank") int rank) {
		
		return playerService.getAllPlayers(category, rank);
	}
	
	@GET
	@Path("/{playername}")
	@Produces(MediaType.APPLICATION_XML)
	public Player getPlayer(@PathParam("playername") String name) {
		
		return playerService.getPlayer(name);
	}
	
}
