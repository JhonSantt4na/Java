package com.santt4na.spring_project.controller;

import com.santt4na.spring_project.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {
	
	private final MessageService messageService;
	
	public MessageController(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@GetMapping("/getService")
	public String getMessageService(){
		return messageService.getMessage();
	}
	
	@GetMapping("/getRepository")
	public String getMessageRepository(){
		return messageService.getMessageRepository();
	}
}
