package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Message;

public interface IServiceMessage {
	List<Message> retrieveAllMessage();

	Message addMessage (Message msg);

	void deleteMessage (int id);

	Message updateMessage (Message msg);

	Message retrieveMessage (int id);
}
