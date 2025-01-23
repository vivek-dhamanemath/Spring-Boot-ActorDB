package com.jsp.springboot.actor.exception;

public class ActorNotFoundByAgeException extends RuntimeException {
	
	private String message;

	public ActorNotFoundByAgeException(String message) {
		super();
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

}
