package com.jsp.springboot.actor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actor {

	@Id
	private int actorId;
	private String actorName;
	private int age;
	private String nationality;
	private String industry;

	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}



}
