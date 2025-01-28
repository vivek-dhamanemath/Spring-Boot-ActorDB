package com.jsp.springboot.actor.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Award {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long awardID;

    private String awardName;
    private String category;
    private int year;

    @ManyToOne
    @JoinColumn(name = "recipientID")
    private Object recipient; // Can be Movie, Actor, or Director (requires polymorphic association)

	
    //Getters and Setters
    public Long getAwardID() {
		return awardID;
	}

	public void setAwardID(Long awardID) {
		this.awardID = awardID;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Object getRecipient() {
		return recipient;
	}

	public void setRecipient(Object recipient) {
		this.recipient = recipient;
	}
    
    
    
}

	
	
	
	

	



