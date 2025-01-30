package com.jsp.springboot.film.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jsp.springboot.film.entity.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

	// These below methods are auto implemented by SPRING DATA JPA(Dependency)
	
	// save(Actor a)
	// findById(int actorId)
	// findAll()
	// delete(Actor a)
	// deleteById(int actorId)


	//findBy
	public List<Artist> findByArtistName(String artistName);
	public List<Artist> findByAge(int age);
	public List<Artist> findByAgeBetween(int age1, int age2);
	public List<Artist> findByIndustry(String industry);

	
	
	//findByActorName : alternative way without following naming convention
	
	//HQL - @Query("SELECT a FROM Actor a WHERE a.actorName=?1")
	//SQL - @Query(value = "SELECT * FROM actor WHERE actorName=?1")
	//public List<Actor> findActorByName(String actorName);     //not following naming convention(findActorByName)
	
	

	
	
	

}
