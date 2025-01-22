package com.jsp.springboot.actor.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.springboot.actor.entity.Actor;
import com.jsp.springboot.actor.repositroy.ActorRepository;
import com.jsp.springboot.actor.service.ActorService;
import com.jsp.springboot.actor.utility.ResponseStrcture;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository actorRepository;

	@Override
	public ResponseEntity<ResponseStrcture<Actor>> addActor(Actor actor) {
		Actor actor1 = actorRepository.save(actor);

		ResponseStrcture<Actor> responseStrcture = new ResponseStrcture<Actor>();
		responseStrcture.setStauscode(HttpStatus.CREATED.value());
		responseStrcture.setMessage("Actor object created  succesfully!!");
		responseStrcture.setActor(actor1);

		return new ResponseEntity<ResponseStrcture<Actor>>(responseStrcture, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Actor>>> findAllActors() {
		List<Actor> actors = actorRepository.findAll();

		if(actors.isEmpty()) {
			return null;
		}else {

			ResponseStrcture<List<Actor>> responseStrcture = new ResponseStrcture<List<Actor>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Actor object Found  succesfully!!");
			responseStrcture.setActor(actors);

			return new ResponseEntity<ResponseStrcture<List<Actor>>>(responseStrcture, HttpStatus.FOUND);
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<Actor>> findByActorId(int actorId) {
		Optional<Actor> optional = actorRepository.findById(actorId);

		if(optional.isPresent()) {
			Actor actor = optional.get();

			ResponseStrcture<Actor> responseStrcture = new ResponseStrcture<Actor>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Actor object Found  succesfully by ActorId!!");
			responseStrcture.setActor(actor);

			return new ResponseEntity<ResponseStrcture<Actor>>(responseStrcture, HttpStatus.FOUND);

		}else {
			return null;
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<Actor>> updateByActorId(int actorId, Actor updateActor) {
		Optional<Actor> optional = actorRepository.findById(actorId);

		if(optional.isPresent()) {
			Actor existingActor = optional.get();
			updateActor.setActorId(existingActor.getActorId());

			ResponseStrcture<Actor> responseStrcture = new ResponseStrcture<Actor>();
			responseStrcture.setStauscode(HttpStatus.OK.value());
			responseStrcture.setMessage("Actor object succesfully Updated ByActorId!!");
			responseStrcture.setActor(updateActor);

			actorRepository.save(updateActor);

			return new ResponseEntity<ResponseStrcture<Actor>>(responseStrcture, HttpStatus.OK);

		}else {
			return null;
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<Actor>> deleteByActorId(int actorId) {
		Optional<Actor> optional = actorRepository.findById(actorId);

		if(optional.isPresent()) {
			Actor existingActor = optional.get();
			actorRepository.delete(existingActor);

			ResponseStrcture<Actor> responseStrcture = new ResponseStrcture<Actor>();
			responseStrcture.setStauscode(HttpStatus.OK.value());
			responseStrcture.setMessage("Actor object succesfully Deleted ByActorId!!");
			responseStrcture.setActor(existingActor);

			return new ResponseEntity<ResponseStrcture<Actor>>(responseStrcture, HttpStatus.OK);
		}else {
			return null;
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByActorName(String actorName) {
		List<Actor> actors = actorRepository.findByActorName(actorName);

		if(actors.isEmpty()) {
			return null;
		}else {
			ResponseStrcture<List<Actor>> responseStrcture = new ResponseStrcture<List<Actor>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Actor object Found  succesfully ByActorName!!");
			responseStrcture.setActor(actors);

			return new ResponseEntity<ResponseStrcture<List<Actor>>>(responseStrcture, HttpStatus.FOUND);
		}

	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByAge(int age){
		List<Actor> actors = actorRepository.findByAge(age);

		if(actors.isEmpty()) {
			return null;
		}else {
			ResponseStrcture<List<Actor>> responseStrcture = new ResponseStrcture<List<Actor>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Actor object Found  succesfully ByAge!!");
			responseStrcture.setActor(actors);

			return new ResponseEntity<ResponseStrcture<List<Actor>>>(responseStrcture, HttpStatus.FOUND);

		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByAgeBetween(int age1, int age2){
		List<Actor> actors = actorRepository.findByAgeBetween(age1, age2);

		if(actors.isEmpty()) {
			return null;
		}else {
			ResponseStrcture<List<Actor>> responseStrcture = new ResponseStrcture<List<Actor>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Actor object Found  succesfully ByAgeBetween!!");
			responseStrcture.setActor(actors);

			return new ResponseEntity<ResponseStrcture<List<Actor>>>(responseStrcture, HttpStatus.FOUND);
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByIndustry(String industry){
		List<Actor> actors = actorRepository.findByIndustry(industry);

		if(actors.isEmpty()) {
			return null;
		}else {
			ResponseStrcture<List<Actor>> responseStrcture = new ResponseStrcture<List<Actor>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Actor object Found  succesfully ByIndustry!!");
			responseStrcture.setActor(actors);

			return new ResponseEntity<ResponseStrcture<List<Actor>>>(responseStrcture, HttpStatus.FOUND);
		}
	}




}
