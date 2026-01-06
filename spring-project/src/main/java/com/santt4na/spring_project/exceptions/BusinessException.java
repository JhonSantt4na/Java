package com.santt4na.spring_project.exceptions;

public class BusinessException extends RuntimeException {
	public BusinessException(String message) {
		super(message);
	}
}