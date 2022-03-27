package tn.esprit.spring.services;

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
public String maxAttendant() {
    return eventsRepository.maxAttendant();
}

}
