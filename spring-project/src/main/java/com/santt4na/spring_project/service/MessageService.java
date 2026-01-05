package com.santt4na.spring_project.service;

import com.santt4na.spring_project.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	private final MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public String getMessage(){
		return "Message for Service";
	}

	public String getMessageRepository(){
		return messageRepository.getMessageRepository();
	}
}
