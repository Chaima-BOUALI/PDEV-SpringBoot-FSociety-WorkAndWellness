package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Events;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repositories.EventRepository;
import tn.esprit.spring.repositories.UserRepository;
@Service
public class EventsServiceImpl implements IServiceEvents {
@Autowired
EventRepository eventsRepository;
@Autowired
UserRepository userRepository; 

@Override
	public List<Events> retrieveAllEvents() {
		return (List<Events>) eventsRepository.findAll();
	}
	


	
	@Override
	public void deleteEvents(int id) {
		eventsRepository.deleteById(id);

	}

	@Override
	public Events updateEvents(Events e) {
		
		return  eventsRepository.save(e);
	}

	@Override
	public Events retrieveEvents(int id) {
		Events E = eventsRepository.findById(id).get();
		return E;
	}


	@Override
	public void AddAndAffect(List<Events> le, Integer idUser) {
		User user = userRepository.findById(idUser).orElse(null);
		for (Events events : le) {
			events.setUser(null);
			eventsRepository.save(events);
		}	
	}
	

@Override
public Events affecterUserAEvent(int idEvent, int idUser) {
    Events ev=eventsRepository.findById(idEvent).get();
    User us=userRepository.findById(idUser).get();
    ev.setUser(us);

    return eventsRepository.save(ev);
}
@Override
public Events addEvents(Events e) {
	// TODO Auto-generated method stub
	return eventsRepository.save(e);
}





@Override
public Events modifierEvent(int idEvent,Events events) {
    Events event=eventsRepository.findById(idEvent).orElse(null);

    if(events.getDate()!=null) event.setDate(events.getDate());
    if(events.getEventTopic()!=null) event.setEventTopic(events.getEventTopic());
    if(events.getDescription()!=null) event.setDescription(events.getDescription());
    if(events.getImagePub()!=null)event.setImagePub(events.getImagePub());
    if(events.getVideoPub()!=null)event.setVideoPub(events.getVideoPub());
    if(events.getUser()!=null)event.setUser(events.getUser());

    return eventsRepository.save(event);
}




@Override
public Events afficherEventByDate(Date date) {
	// TODO Auto-generated method stub
	return eventsRepository.getEventsByDate(date);
	
}




@Override
public List<Events> supprimerAllEventsByDate(Date date) {
	// TODO Auto-generated method stub
	return eventsRepository.deleteAllByDate(date);
}

}
