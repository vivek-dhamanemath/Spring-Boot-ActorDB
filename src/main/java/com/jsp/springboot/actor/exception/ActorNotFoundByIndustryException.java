package com.jsp.springboot.actor.exception;

public class ActorNotFoundByIndustryException extends RuntimeException {

	private String message;

	public ActorNotFoundByIndustryException(String message) {
		
		this.message = message;

	}

	public String getMessage() {
		return message;
	}
}