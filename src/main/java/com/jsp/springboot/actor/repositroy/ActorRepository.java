package com.jsp.springboot.actor.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.actor.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
	
	// save(Actor a)
	// findById(int actorId)
	// findAll()
	// delete(Actor a)
	//deleteById(int actorId)
	
	
	//findBy
	public List<Actor> findByActorName(String actorName);
	public List<Actor> findByAge(int age);
	public List<Actor> findByAgeBetween(int age1, int age2);
	public List<Actor> findByIndustry(String industry);

	
}
