package app.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.EventManager;
import app.entities.Event;
import app.repositories.EventRepository;

@Component
@Path("/event")
public class EventController {
	
	
	Logger logger = LoggerFactory.getLogger(EventController.class);
	
	@Autowired
	EventRepository eventRepo;
	
	@Autowired
	EventManager eventMan;
	
	@GET
	@Path("/new")
	
	public String eventData(@QueryParam("Event Name") String eventName, 
			@QueryParam("Venue") String venue, 
			@QueryParam("Month") String dateMonth, 
			@QueryParam("Day") Double dateDay, 
			@QueryParam("Year") Double dateYear, 
			@QueryParam("Time") String time, 
			@QueryParam("Org Name") String orgName, 
			@QueryParam("Description") String description,
			@QueryParam("Category") String category,
			@QueryParam("Open to All") Boolean opa)
	{
		return eventMan.newEvent(
				eventName,
				venue,
				dateMonth,
				dateDay,
				dateYear,
				time,
				orgName,
				description,
				category,
				opa);
	}
	
	@GET
	@Path("/sortmonth")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getMonth(@QueryParam("Month") String dateMonth)
	{
		return eventRepo.findBydateMonth(dateMonth);
	}

//	@GET
//	@Path("/type")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<StrayAnimal> getTheType(@QueryParam("Animal Type") String type)
//	{
//		return saRepo.findByType(type);
//	}
//	
//	@GET
//	@Path("/neutered")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<StrayAnimal> getTheNeutered(@QueryParam("Neutered") Boolean neutered)
//	{
//		return saRepo.findByNeutered(neutered);
//	}
}


//	
//	@POST
//	@Path("/signup")
//	@Produces(MediaType.APPLICATION_JSON)
//	public HashMap<String, String> signup(@FormParam("username") String username, 
// 	 					 @FormParam("password") String password, 
//						 @FormParam("email") String email)
//	{
//		return loginManager.signUp(username, password, email, false);
//	}
//
//	@POST
//	@Path("/signup2")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public HashMap<String, String> signup2(User u)
//	{
//		return loginManager.signUp(u.getUsername(), u.getPassword(), u.getEmail(), true);
//	}
//
//	
//	@POST
//	@Path("/verify")
//	@Produces(MediaType.APPLICATION_JSON)
//	public HashMap<String, String> verify(@FormParam("email") String email,
//										  @FormParam("verifyKey") String key)
//	{
//		return loginManager.verify(email, key);
//	}
//
//	@POST
//	@Path("/login")
//	@Produces(MediaType.APPLICATION_JSON)
//	public HashMap<String, String> login(@FormParam("username") String username,
//										  @FormParam("password") String password)
//	{
//		return loginManager.login(username, password);
//	}
//
//	
//	@GET
//	@Path("/welcome")
//	@Produces(MediaType.APPLICATION_JSON)
//	public HashMap<String, String> welcome(@QueryParam("token") String token)
//	{
//		return loginManager.welcome(token);
//	}
//

