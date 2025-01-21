package com.jsp.springboot.actor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.springboot.actor.entity.Actor;
import com.jsp.springboot.actor.service.ActorService;


@Controller
@ResponseBody //to bind the method to http response
public class ActorController {

	@Autowired
	private ActorService actorService;
	//ActorService actorService = new ActorService();
	
	@RequestMapping(value = "/actors", method = RequestMethod.POST)
	public Actor addActor(@RequestBody Actor actor) {
		return actorService.addActor(actor);	
	}
	
	@RequestMapping(value = "/actors", method = RequestMethod.GET)
	public List<Actor> findAllActors() {
		return actorService.findAllActors();	
	}
	
	@RequestMapping(value = "/actors/id", method = RequestMethod.GET)
	public Actor findByActorId(int actorId) {
		return actorService.findByActorId(actorId);	
	}
	
	@RequestMapping(value = "/actors", method = RequestMethod.PUT)
	public Actor updateActorById(int actorId,@RequestBody Actor updateActor) {
		return actorService.updateByActorId(actorId, updateActor);	
	}
	
	@RequestMapping(value = "/actors/name", method = RequestMethod.GET)
	public List<Actor> findByActorName(String actorName) {
		return actorService.findByActorName(actorName);	
	}
	
	@RequestMapping(value = "/actors/age", method = RequestMethod.GET)
	public List<Actor> findByAge(int age) {
		return actorService.findByAge(age);	
	}
	
	@RequestMapping(value = "/actors/ageBetween", method = RequestMethod.GET)
	public List<Actor> findByAgeBetween(int age1, int age2) {
		return actorService.findByAgeBetween(age1, age2);	
	}
	
	@RequestMapping(value = "/actors/industry", method = RequestMethod.GET)
	public List<Actor> findByIndustry(String industry) {
		return actorService.findByIndustry(industry);	
	}
}
