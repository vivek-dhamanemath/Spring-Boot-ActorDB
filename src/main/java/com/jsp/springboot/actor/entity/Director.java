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
public class Director {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long directorID;

    private String name;
    private LocalDate dateOfBirth;
    private String bio;

    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL)
    private List<Movie> movies;

    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL)
    private List<Award> awards;

    
    //Getters and Setters
	public Long getDirectorID() {
		return directorID;
	}

	public void setDirectorID(Long directorID) {
		this.directorID = directorID;
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

	public List<Award> getAwards() {
		return awards;
	}

	public void setAwards(List<Award> awards) {
		this.awards = awards;
	}
    
    
    
}	
	
	
	
	
	
	

