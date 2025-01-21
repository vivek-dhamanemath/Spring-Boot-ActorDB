package com.jsp.springboot.actor.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.actor.entity.Actor;
import com.jsp.springboot.actor.repositroy.ActorRepository;
import com.jsp.springboot.actor.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository actorRepository;

	@Override
	public Actor addActor(Actor actor) {

		return actorRepository.save(actor);
	}

	@Override
	public List<Actor> findAllActors() {
		List<Actor> actors = actorRepository.findAll();

		if(actors.isEmpty()) {
			return null;
		}else {
			return actors;
		}

	}

	@Override
	public Actor findByActorId(int actorId) {
		Optional<Actor> optional = actorRepository.findById(actorId);

		if(optional.isPresent()) {
			Actor actor = optional.get();
			return actor;
		}else {
			return null;
		}
	}

	@Override
	public Actor updateByActorId(int actorId, Actor updateActor) {
		Optional<Actor> optional = actorRepository.findById(actorId);

		if(optional.isPresent()) {
			Actor existingActor = optional.get();
			updateActor.setActorId(existingActor.getActorId());
			return actorRepository.save(updateActor);
		}else {
			return null;
		}
	}

	@Override
	public Actor deleteByActorId(int actorId) {
		Optional<Actor> optional = actorRepository.findById(actorId);

		if(optional.isPresent()) {
			Actor existingActor = optional.get();
			actorRepository.delete(existingActor);

			return existingActor;
		}else {
			return null;
		}
	}

	@Override
	public List<Actor> findByActorName(String actorName) {
		List<Actor> actors = actorRepository.findByActorName(actorName);

		if(actors.isEmpty()) {
			return null;
		}else {
			return actors;
		}

	}
	
	@Override
	public List<Actor> findByAge(int age){
		List<Actor> actors = actorRepository.findByAge(age);

		if(actors.isEmpty()) {
			return null;
		}else {
			return actors;
		}
	}
	
	@Override
	public List<Actor> findByAgeBetween(int age1, int age2){
		List<Actor> actors = actorRepository.findByAgeBetween(age1, age2);

		if(actors.isEmpty()) {
			return null;
		}else {
			return actors;
		}
	}
	
	@Override
	public List<Actor> findByIndustry(String industry){
		List<Actor> actors = actorRepository.findByIndustry(industry);

		if(actors.isEmpty()) {
			return null;
		}else {
			return actors;
		}
	}
	



}
