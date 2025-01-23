package com.jsp.springboot.actor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot.actor.entity.Actor;
import com.jsp.springboot.actor.service.ActorService;
import com.jsp.springboot.actor.utility.ResponseStrcture;


//@Controller
//@ResponseBody //to bind the method to http response

@RestController
@RequestMapping("/actors") 
public class ActorController {

	@Autowired
	private ActorService actorService;
	//ActorService actorService = new ActorService();



	//@RequestMapping(value = "/actors", method = RequestMethod.POST)
	@PostMapping()   
	public ResponseEntity<ResponseStrcture<Actor>> addActor(@RequestBody Actor actor) {
		return actorService.addActor(actor);	
	}


	@GetMapping()
	public ResponseEntity<ResponseStrcture<List<Actor>>> findAllActors() {
		return actorService.findAllActors();	
	}

	@GetMapping("/{actorId}")  //http://localhost:8080/actors/101 (here we directly passing the id value(101))
	public ResponseEntity<ResponseStrcture<Actor>> findByActorId(@PathVariable int actorId) {
		return actorService.findByActorId(actorId);	
	}

	@PutMapping("/id")  //http://localhost:8080/actors/id (here we just passing the attribute(id) then in POSTMAN we write id=101)
	public ResponseEntity<ResponseStrcture<Actor>> updateActorById(int actorId,@RequestBody Actor updateActor) {
		return actorService.updateByActorId(actorId, updateActor);	
	}

	@DeleteMapping("/id")
	public ResponseEntity<ResponseStrcture<Actor>> deleteByActorId(int actorId) {
		return actorService.deleteByActorId(actorId);	
	}

	@GetMapping("/name")
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByActorName(String actorName) {
		return actorService.findByActorName(actorName);	
	}

	@GetMapping("/age")
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByAge(int age) {
		return actorService.findByAge(age);	
	}

	@GetMapping("/ageBetween")
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByAgeBetween(int age1, int age2) {
		return actorService.findByAgeBetween(age1, age2);	
	}

	@GetMapping("/industry")
	public ResponseEntity<ResponseStrcture<List<Actor>>> findByIndustry(String industry) {
		return actorService.findByIndustry(industry);	
	}
}
