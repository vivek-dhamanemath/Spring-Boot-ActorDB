package com.jsp.springboot.film.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

import com.jsp.springboot.artist.utility.ResponseStrcture;
import com.jsp.springboot.film.entity.Artist;

@Service
public interface ArtistService {

	//public Artist addArtist(Artist artist);
	public ResponseEntity<ResponseStrcture<Artist>> addArtist(Artist artist);

	public ResponseEntity<ResponseStrcture<List<Artist>>> findAllArtist();

	public ResponseEntity<ResponseStrcture<Artist>> findByArtistId(int artistId);

	public ResponseEntity<ResponseStrcture<Artist>> updateByArtistId(int artistId, Artist updateArtist);

	public ResponseEntity<ResponseStrcture<Artist>> deleteByArtistId(int artistId);

	public ResponseEntity<ResponseStrcture<List<Artist>>> findByArtistName(String artistName);

	public ResponseEntity<ResponseStrcture<List<Artist>>> findByAge(int age);

	public ResponseEntity<ResponseStrcture<List<Artist>>> findByAgeBetween(int age1, int age2);

	public ResponseEntity<ResponseStrcture<List<Artist>>> findByIndustry(String industry);






}
