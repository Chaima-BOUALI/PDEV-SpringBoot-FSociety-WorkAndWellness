package tn.esprit.spring.services;

import java.util.List;
import java.util.Map;

import tn.esprit.spring.entities.Publication;

public interface IServicePublication {
	List<Publication> retrieveAllPosts();
	void deletePublication(int id);
	
	Publication getPublicationById(int id);
	Publication addPublication(Publication p);
	
	
	public List<Publication>searchPublications (String pattern);
	
	
	
	public int countPublicationUser(int idUser);
	
	
	public Map<Long,Integer>getPublicationsbyViewes();
}
