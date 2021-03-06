package org.acme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/movies")

public class ExampleResource {

	public static List<String> movies = new ArrayList<>();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMovies()
	{   

		return Response.ok(movies).build();
	
	}
	
	@GET
	@Path("/size")
	@Produces(MediaType.TEXT_PLAIN)
	public Integer countMovies()
	{
		return movies.size();	
	}
	
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response createMovie(String newmovie)
	{
		movies.add(newmovie);
		
		return Response.ok(movies).build();
		
	}
	
	
	
	 
	 
	
}