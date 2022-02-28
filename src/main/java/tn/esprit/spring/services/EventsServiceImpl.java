package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entities.Events;
import tn.esprit.spring.repositories.EventRepository;
@Service
public class EventsServiceImpl implements IServiceEvents {
@Autowired
EventRepository eventRepository;
	@Override
	public List<Events> retrieveAllEvents() {
		return (List<Events>) eventRepository.findAll();
	}
	

	@Override
	public Events addEvents(Events e) {
		
		return eventRepository.save(e);
	}

	@Override
	public void deleteEvents(int id) {
		eventRepository.deleteById(id);

	}

	@Override
	public Events updateEvents(Events e) {
		
		return  eventRepository.save(e);
	}

	@Override
	public Events retrieveEvents(int id) {
		Events E = eventRepository.findById(id).get();
		return E;
	}

}
