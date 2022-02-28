package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Message;
import tn.esprit.spring.repositories.MessageRepository;
@Service
public class MessageServiceImpl implements IServiceMessage {
@Autowired
MessageRepository messageRepository;
	@Override
	public List<Message> retrieveAllMessage() {
		
		return (List<Message>) messageRepository.findAll();
	}

	@Override
	public Message addMessage(Message msg) {
	
		return messageRepository.save(msg) ;
	}

	@Override
	public void deleteMessage(int id) {
		messageRepository.deleteById(id);

	}

	@Override
	public Message updateMessage(Message msg) {
		
		return messageRepository.save(msg);
	}

	@Override
	public Message retrieveMessage(int id) {
		Message M = messageRepository.findById(id).get();
		return M;
	}

}
