package com.santt4na.spring_project.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
	public String getMessageRepository(){
		return "Helo for Repository";
	}
}