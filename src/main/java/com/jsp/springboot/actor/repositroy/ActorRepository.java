package com.jsp.springboot.actor.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.springboot.actor.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

	// These below methods are auto implemented by SPRING DATA JPA(Dependency)
	
	// save(Actor a)
	// findById(int actorId)
	// findAll()
	// delete(Actor a)
	// deleteById(int actorId)


	//findBy
	public List<Actor> findByActorName(String actorName);
	public List<Actor> findByAge(int age);
	public List<Actor> findByAgeBetween(int age1, int age2);
	public List<Actor> findByIndustry(String industry);

	
	
	//findByActorName : alternative way without following naming convention
	
	//HQL - @Query("SELECT a FROM Actor a WHERE a.actorName=?1")
	//SQL - @Query(value = "SELECT * FROM actor WHERE actorName=?1")
	//public List<Actor> findActorByName(String actorName);     //not following naming convention(findActorByName)
	
	

	
	
	

}
