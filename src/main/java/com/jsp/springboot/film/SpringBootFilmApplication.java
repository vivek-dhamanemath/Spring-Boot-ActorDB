package com.jsp.springboot.film;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jsp.springboot.film.controller.ArtistController;
import com.jsp.springboot.film.entity.Artist;

@SpringBootApplication
public class SpringBootFilmApplication {

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
		SpringApplication.run(SpringBootFilmApplication.class, args);


	}

}
