package com.jsp.springboot.actor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jsp.springboot.actor.controller.ActorController;
import com.jsp.springboot.actor.entity.Actor;

@SpringBootApplication
public class SpringBootActorApplication {

	/*
	 * public static void main(String[] args) { ApplicationContext ac =
	 * SpringApplication.run(SpringBootActorApplication.class, args);
	 * 
	 * Actor actor = new Actor(); actor.setActorId(101);
	 * actor.setActorName("Sudeep"); actor.setAge(45);
	 * actor.setIndustry("Sandalwood"); actor.setNationality("Indian");
	 * 
	 * ActorController actorController = ac.getBean(ActorController.class);
	 * actorController.addActor(actor);
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootActorApplication.class, args);
		
		
	}

}
