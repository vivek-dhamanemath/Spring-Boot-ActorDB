package com.jsp.springboot.actor.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Producer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producerID;

    private String name;
    private LocalDate dateOfBirth;
    private String bio;

    @OneToMany(mappedBy = "producer", cascade = CascadeType.ALL)
    private List<Movie> movies;

    
    //Getters and Setters
	public Long getProducerID() {
		return producerID;
	}

	public void setProducerID(Long producerID) {
		this.producerID = producerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
    
    
    
}