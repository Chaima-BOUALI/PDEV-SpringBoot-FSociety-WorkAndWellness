package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Events;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repositories.EventRepository;
import tn.esprit.spring.repositories.UserRepository;
@Service
public class UserServiceImpl implements IServiceUser {
@Autowired
UserRepository userRepository;
EventRepository eventRepository; 
	@Override
	public List<User> retrieveAllUsers() {
		return  (List<User>) userRepository.findAll();

	}

	@Override
	public User addUser(User u) {
	return userRepository.save(u);

	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);		

	}

	@Override
	public User updateUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public User retrieveUser(int id) {
		User u = userRepository.findById(id).get();
		return u;
	}

	@Override
	public void AddAndAffect(List<Events> le, Integer idUser) {
		User user = userRepository.findById(idUser).orElse(null);
		for (Events events : le) {
			events.setUsers(null);
			eventRepository.save(events);
		}			
	}

}
