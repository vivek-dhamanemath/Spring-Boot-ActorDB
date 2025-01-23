package com.jsp.springboot.actor.exception;

public class ActorNotFoundByNameException extends RuntimeException {

	private String message;

	public ActorNotFoundByNameException(String message) {
		super();
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

}
