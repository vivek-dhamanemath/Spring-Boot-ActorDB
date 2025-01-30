package com.jsp.springboot.film.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jsp.springboot.artist.utility.ResponseStrcture;
import com.jsp.springboot.film.entity.Artist;
import com.jsp.springboot.film.service.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @PostMapping
    public ResponseEntity<ResponseStrcture<Artist>> addArtist(@RequestBody Artist artist) {
        return artistService.addArtist(artist);
    }

    @GetMapping
    public ResponseEntity<ResponseStrcture<List<Artist>>> findAllArtists() {
        return artistService.findAllArtist();
    }

    @GetMapping("/id")
    public ResponseEntity<ResponseStrcture<Artist>> findByArtistId(@RequestParam int artistId) {
        return artistService.findByArtistId(artistId);
    }

    @PutMapping("/id")
    public ResponseEntity<ResponseStrcture<Artist>> updateArtistById(@RequestParam int artistId, @RequestBody Artist updateArtist) {
        return artistService.updateByArtistId(artistId, updateArtist);
    }

    @DeleteMapping("/id")
    public ResponseEntity<ResponseStrcture<Artist>> deleteByArtistId(@RequestParam int artistId) {
        return artistService.deleteByArtistId(artistId);
    }

    @GetMapping("/name")
    public ResponseEntity<ResponseStrcture<List<Artist>>> findByArtistName(@RequestParam String artistName) {
        return artistService.findByArtistName(artistName);
    }

    @GetMapping("/age")
    public ResponseEntity<ResponseStrcture<List<Artist>>> findByAge(@RequestParam int age) {
        return artistService.findByAge(age);
    }

    @GetMapping("/ageBetween")
    public ResponseEntity<ResponseStrcture<List<Artist>>> findByAgeBetween(@RequestParam int age1, @RequestParam int age2) {
        return artistService.findByAgeBetween(age1, age2);
    }

    @GetMapping("/industry")
    public ResponseEntity<ResponseStrcture<List<Artist>>> findByIndustry(@RequestParam String industry) {
        return artistService.findByIndustry(industry);
    }
}