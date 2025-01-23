package com.jsp.springboot.actor.exception;

public class ActorNotFoundByIdException extends RuntimeException {

	private String message;

	public ActorNotFoundByIdException(String message) {
		super();
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

}
