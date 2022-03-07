package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Events;

public interface IServiceEvents {
	List<Events> retrieveAllEvents();

	Events addEvents (Events e);

	void deleteEvents (int id);

	Events updateEvents(Events e);

	Events retrieveEvents (int id);
	
	void AddAndAffect(List<Events> le, Integer idUser);

}
