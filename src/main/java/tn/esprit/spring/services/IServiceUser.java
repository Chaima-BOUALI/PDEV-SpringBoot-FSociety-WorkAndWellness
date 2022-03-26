package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Events;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;

public interface IServiceUser {
	List<User> retrieveAllUsers();

	User addUser (User u);

	void deleteUser (int id);

	User updateUser (User u);

	User retrieveUser (int id);
	void AddAndAffect(List<Events> le, Integer idUser);
	Role SaveRole (Role role);
	//void AddRoleToUser (String RoleName, String username); 
	User getUser (String username); 
	List<User> getAllUsers (); 


}
