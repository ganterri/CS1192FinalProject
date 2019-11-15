package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entities.Event;
import app.repositories.EventRepository;


@Component
public class EventManager 
{
	@Autowired
	EventRepository eventRepo;
	
	public String newEvent(String eventName,
			String venueName,
			String dateMonth,
			Double dateDay,
			Double dateYear, 
			Double startTime,
			Double endTime,
			String orgName, 
			String description,
			String category,
			Boolean opa
			)
	{
		Event x = new Event();
		x.setEventName(eventName);
		x.setDateMonth(dateMonth);
		x.setDateDay(dateDay);
		x.setDateYear(dateYear);
		x.setStartTime(startTime);
		x.setEndTime(endTime);
		x.setDescription(description);
		x.setCategory(category);
		x.setOpa(opa);
		eventRepo.save(x);
		
		//idle variables: venueName, orgName
		//need to check if the org and venue is already in their respective database system
		//if so, get the venueID and orgID from the respective venueName and orgName
		//if not, trigger a window to open to inquiring to fill up the database - venueName and/or orgName

		
		return "Event has been uploaded!";
		
	}
}

		
//		usernameToUserMap.put(username, u);
//		emailToUserMap.put(email, u);
////				
//		u.setJson(json);
//		
//		userRepo.save(u);
//		
//		HashMap<String, String> reply = new HashMap<String, String>();
//		reply.put("verifyKey", u.getVerifyCode());
//		reply.put("username", u.getUsername());
//		reply.put("password", u.getPassword());
//		reply.put("email", u.getEmail());
//		
//		reply.put("message", "POST to /verify pass 'email' and 'verifyKey'");
//		
//		return reply;
//	}
//
//	
//	
//	public HashMap<String, String> login(String username, String password)
//	{
//		User u = userRepo.findByUsername(username);
//		
//		if (u==null)
//		{
//			throw new ServiceException("Invalid username");
//		}
//		
//		if (!u.isVerified())
//		{
//			throw new ServiceException("Not yet verified");			
//		}
//		
//		if (!u.getPassword().equals(password))
//		{
//			throw new ServiceException("Invalid password");
//		}
//		
//		String token = UUID.randomUUID().toString();
//		
//		Token tok = new Token();
//		tok.setToken(token);
//		tok.setUserId(u.getId());
//		
//		tokenRepo.save(tok);
//		
//		
//		HashMap<String, String> reply = new HashMap<String, String>();
//		reply.put("token", token);
//		reply.put("message", "GET to /welcome pass 'token'");
//		
//		return reply;
//	}
//	
//	
//	public HashMap<String, String> welcome(String token)
//	{
//		Token t = tokenRepo.findByToken(token);
//		
//		java.util.Optional<User> ou = userRepo.findById(t.getUserId());
//		User u = ou.get();
//		
//		if (u==null)
//		{
//			throw new ServiceException("Invalid token");
//		}
//		
//		if (u.isJson())
//		{
//			HashMap<String, String> reply = new HashMap<String, String>();
//			reply.put("message", "Congratulations you have 20pts + 2pts for using JSON");
//			
//			return reply;			
//		}
//		else
//		{
//					
//			HashMap<String, String> reply = new HashMap<String, String>();
//			reply.put("message", "Congratulations you have 20pts");
//			
//			return reply;
//		}
//	}
//
//}
