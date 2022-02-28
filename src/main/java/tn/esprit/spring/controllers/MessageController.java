package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import tn.esprit.spring.entities.Message;
import tn.esprit.spring.services.IServiceMessage;

@EnableSwagger2
@RestController
@RequestMapping("/message")
public class MessageController {
@Autowired
IServiceMessage serviceMessage;

@PostMapping("/add-message")
@ResponseBody

public Message addMessage(@RequestBody Message msg)
{
Message M = serviceMessage.addMessage(msg);
return M;
}

@DeleteMapping("/remove-message/{message-id}")
@ResponseBody
public void removeMessage(@PathVariable("message-id") int idMessage) {
	 serviceMessage.deleteMessage(idMessage);
}

@ResponseBody
@GetMapping("/showMessages")
public List<Message> getMessages() {
	List<Message> listMessages = serviceMessage.retrieveAllMessage();
return listMessages;
}
@GetMapping("/showmessage/{message-id}")
@ResponseBody
public Message retrieveMessage(@PathVariable("message-id") int idMessage) {
return serviceMessage.retrieveMessage(idMessage);
}
@PutMapping("/modify-message")
@ResponseBody
public Message modifyMessage(@RequestBody Message msg) {
return serviceMessage.updateMessage(msg);
}
}
