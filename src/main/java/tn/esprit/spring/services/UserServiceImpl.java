package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Events;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.RoleName;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repositories.EventRepository;
import tn.esprit.spring.repositories.RoleRepository;
import tn.esprit.spring.repositories.UserRepository;
@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements IServiceUser, UserDetailsService{
@Autowired
UserRepository userRepository;
EventRepository eventRepository; 
RoleRepository roleRepository; 

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = userRepository.findByUsername(username); 
	if(user == null) {
		log.error("user not found in the database");
		throw new UsernameNotFoundException("user not found in the database"); 
	}else {
		log.info("user found in the database: {}", username);
	}
	Collection<SimpleGrantedAuthority> authorities = new ArrayList<>(); 
	//user.getRoles().forEach(role -> {authorities .add(new SimpleGrantedAuthority(user.getRoles()))}); 
	return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
}

	@Override
	public List<User> retrieveAllUsers() {
		log.info("Retrieving all users in the data base");	
		return  (List<User>) userRepository.findAll();

	}

	@Override
	public User addUser(User u) {
		log.info("Adding users to the data base");	

	return userRepository.save(u);

	}

	@Override
	public void deleteUser(int id) {
		log.info("Deleting users from the data base");	

		userRepository.deleteById(id);		

	}

	@Override
	public User updateUser(User u) {
		log.info("updating users in the data base");	

		return userRepository.save(u);
	}

	@Override
	public User retrieveUser(int id) {
		log.info("finding  users by their ID in the data base");	

		User u = userRepository.findById(id).get();
		return u;
	}

	@Override
	public void AddAndAffect(List<Events> le, Integer idUser) {
		log.info("Adding and Affecting users to events in the data base");	

		User user = userRepository.findById(idUser).orElse(null);
		for (Events events : le) {
			events.setUsers(null);
			eventRepository.save(events);
		}			
	}

	@Override
	public Role SaveRole(Role role) {
		log.info("Adding Roles in the data base");	

		return roleRepository.save(role);
	}

	/*@Override
	public void AddRoleToUser(String RoleName , String username) {
			log.info("Adding Roles To users in the data base");	

		User u = userRepository.findByUsername(username);
		Role r = roleRepository.findByRoleName(RoleName);
	u.getRoles().add(r);
	}*/

	@Override
	public User getUser(String username) {
		log.info("Retrieving users by their usernames in the data base");	

		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}




}
