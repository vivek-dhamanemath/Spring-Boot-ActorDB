package com.jsp.springboot.film.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.springboot.artist.exception.ArtistNotFoundByAgeException;
import com.jsp.springboot.artist.exception.ArtistNotFoundByIdException;
import com.jsp.springboot.artist.exception.ArtistNotFoundByIndustryException;
import com.jsp.springboot.artist.exception.ArtistNotFoundByNameException;
import com.jsp.springboot.artist.utility.ResponseStrcture;
import com.jsp.springboot.film.entity.Artist;
import com.jsp.springboot.film.repositroy.ArtistRepository;
import com.jsp.springboot.film.service.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistRepository artistRepository;

	@Override
	public ResponseEntity<ResponseStrcture<Artist>> addArtist(Artist artist) {
		Artist artist1 = artistRepository.save(artist);

		ResponseStrcture<Artist> responseStrcture = new ResponseStrcture<Artist>();
		responseStrcture.setStauscode(HttpStatus.CREATED.value());
		responseStrcture.setMessage("Artist object created  succesfully!!");
		responseStrcture.setArtist(artist1);

		return new ResponseEntity<ResponseStrcture<Artist>>(responseStrcture, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Artist>>> findAllArtist() {
		List<Artist> artists = artistRepository.findAll();

		if(artists.isEmpty()) {
			throw new ArtistNotFoundByIdException("Artist not found");
			
		}else {

			ResponseStrcture<List<Artist>> responseStrcture = new ResponseStrcture<List<Artist>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Artist object Found  succesfully!!");
			responseStrcture.setArtist(artists);

			return new ResponseEntity<ResponseStrcture<List<Artist>>>(responseStrcture, HttpStatus.FOUND);
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<Artist>> findByArtistId(int artistId) {
		Optional<Artist> optional = artistRepository.findById(artistId);

		if(optional.isPresent()) {
			Artist artist = optional.get();

			ResponseStrcture<Artist> responseStrcture = new ResponseStrcture<Artist>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Artist object Found  succesfully by ArtistId!!");
			responseStrcture.setArtist(artist);

			return new ResponseEntity<ResponseStrcture<Artist>>(responseStrcture, HttpStatus.FOUND);

		}else {
			throw new ArtistNotFoundByIdException("Artist not found");
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<Artist>> updateByArtistId(int artistId, Artist updateArtist) {
		Optional<Artist> optional = artistRepository.findById(artistId);

		if(optional.isPresent()) {
			Artist existingArtist = optional.get();
			updateArtist.setArtistId(existingArtist.getArtistId());
			artistRepository.save(updateArtist);
			
			ResponseStrcture<Artist> responseStrcture = new ResponseStrcture<Artist>();
			responseStrcture.setStauscode(HttpStatus.OK.value());
			responseStrcture.setMessage("Artist object succesfully Updated ByArtistId!!");
			responseStrcture.setArtist(updateArtist);

			return new ResponseEntity<ResponseStrcture<Artist>>(responseStrcture, HttpStatus.OK);

		}else {
			throw new ArtistNotFoundByIdException("Artist not found");
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<Artist>> deleteByArtistId(int artistId) {
		Optional<Artist> optional = artistRepository.findById(artistId);

		if(optional.isPresent()) {
			Artist existingArtist = optional.get();
			artistRepository.delete(existingArtist);

			ResponseStrcture<Artist> responseStrcture = new ResponseStrcture<Artist>();
			responseStrcture.setStauscode(HttpStatus.OK.value());
			responseStrcture.setMessage("Artist object succesfully Deleted ByArtistId!!");
			responseStrcture.setArtist(existingArtist);

			return new ResponseEntity<ResponseStrcture<Artist>>(responseStrcture, HttpStatus.OK);
		}else {
			throw new ArtistNotFoundByIdException("Artist not found");
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Artist>>> findByArtistName(String artistName) {
		List<Artist> artists = artistRepository.findByArtistName(artistName);

		if(artists.isEmpty()) {
			throw new ArtistNotFoundByNameException("Artist not found");
			
		}else {
			ResponseStrcture<List<Artist>> responseStrcture = new ResponseStrcture<List<Artist>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Artist object Found  succesfully ByArtistName!!");
			responseStrcture.setArtist(artists);

			return new ResponseEntity<ResponseStrcture<List<Artist>>>(responseStrcture, HttpStatus.FOUND);
		}

	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Artist>>> findByAge(int age){
		List<Artist> artists = artistRepository.findByAge(age);

		if(artists.isEmpty()) {
			throw new ArtistNotFoundByAgeException("Artist not found");
			
		}else {
			ResponseStrcture<List<Artist>> responseStrcture = new ResponseStrcture<List<Artist>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Artist object Found  succesfully ByAge!!");
			responseStrcture.setArtist(artists);

			return new ResponseEntity<ResponseStrcture<List<Artist>>>(responseStrcture, HttpStatus.FOUND);

		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Artist>>> findByAgeBetween(int age1, int age2){
		List<Artist> artists = artistRepository.findByAgeBetween(age1, age2);

		if(artists.isEmpty()) {
			throw new ArtistNotFoundByAgeException("Artist not found");
			
		}else {
			ResponseStrcture<List<Artist>> responseStrcture = new ResponseStrcture<List<Artist>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Artist object Found  succesfully ByAgeBetween!!");
			responseStrcture.setArtist(artists);

			return new ResponseEntity<ResponseStrcture<List<Artist>>>(responseStrcture, HttpStatus.FOUND);
		}
	}

	@Override
	public ResponseEntity<ResponseStrcture<List<Artist>>> findByIndustry(String industry){
		List<Artist> artists = artistRepository.findByIndustry(industry);

		if(artists.isEmpty()) {
			throw new ArtistNotFoundByIndustryException("Artist not found");
			
		}else {
			ResponseStrcture<List<Artist>> responseStrcture = new ResponseStrcture<List<Artist>>();
			responseStrcture.setStauscode(HttpStatus.FOUND.value());
			responseStrcture.setMessage("Artist object Found  succesfully ByIndustry!!");
			responseStrcture.setArtist(artists);

			return new ResponseEntity<ResponseStrcture<List<Artist>>>(responseStrcture, HttpStatus.FOUND);
		}
	}




}
