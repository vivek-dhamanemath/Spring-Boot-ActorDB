package com.jsp.springboot.actor.utility;

import java.util.List;

import com.jsp.springboot.actor.entity.Actor;

public class ResponseStrcture<T> {
	
	private int stauscode;
	private String message;
	private T actor;
	
	public int getStauscode() {
		return stauscode;
	}
	public void setStauscode(int stauscode) {
		this.stauscode = stauscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getActor() {
		return actor;
	}
	public void setActor(T actor) {
		this.actor = actor;
	}
	
	
	
	

}
