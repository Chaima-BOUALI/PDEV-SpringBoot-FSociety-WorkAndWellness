package tn.esprit.spring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Message;
import tn.esprit.spring.entities.MessageType;

@Component
@Slf4j
public class webSocketEventListener {
	private static final Logger LOGGER =LoggerFactory.getLogger(webSocketEventListener.class);
	
	@Autowired
	private SimpMessageSendingOperations sendingOperations;
	
	@EventListener
	public void handleWebSocketConnectListener(final SessionConnectEvent event)
	{
		LOGGER.info("we have a new connection!");
	}
	
	@EventListener
	public void handleWebSocketDisconnectListener(final SessionDisconnectEvent event)
	{
		final StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		final String username = (String) headerAccessor.getSessionAttributes().get("username");
		final Message chatMessage = Message.builder().MessageType(MessageType.Disconnect).sender(username).build();
		sendingOperations.convertAndSend("/topic/public",chatMessage);
	}
}
