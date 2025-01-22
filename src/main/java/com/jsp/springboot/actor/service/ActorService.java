package com.jsp.springboot.actor.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

import com.jsp.springboot.actor.entity.Actor;
import com.jsp.springboot.actor.utility.ResponseStrcture;

public interface ActorService {
	
	//public Actor addActor(Actor actor);
	public ResponseEntity<ResponseStrcture<Actor>> addActor(Actor actor);
	
	public ResponseEntity<ResponseStrcture<List<Actor>>> findAllActors();
	
	public ResponseEntity<ResponseStrcture<Actor>> findByActorId(int actorId);
	
	public ResponseEntity<ResponseStrcture<Actor>> updateByActorId(int actorId, Actor updateActor);
	
	public ResponseEntity<ResponseStrcture<Actor>> deleteByActorId(int actorId);
	
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByActorName(String actorName);
	
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByAge(int age);
	
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByAgeBetween(int age1, int age2);
	
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByIndustry(String industry);

	




}
