package com.jsp.springboot.actor.service;

import java.util.List;

import com.jsp.springboot.actor.entity.Actor;

public interface ActorService {
	
	public Actor addActor(Actor actor);
	
	public List<Actor> findAllActors();
	
	public Actor findByActorId(int actorId);

	public Actor updateByActorId(int actorId, Actor updateActor);
	
	public Actor deleteByActorId(int actorId);
	
	
	public List<Actor> findByActorName(String actorName);
	
	public List<Actor> findByAge(int age);
	
	public List<Actor> findByAgeBetween(int age1, int age2);
	
	public List<Actor> findByIndustry(String industry);




}
