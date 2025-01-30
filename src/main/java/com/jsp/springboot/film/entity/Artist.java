package com.jsp.springboot.film.entity;

import com.jsp.springboot.film.enums.Gender;
import com.jsp.springboot.film.enums.Industry;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(indexes = {
    @Index(name = "idx_artist_name", columnList = "artistName"),
    @Index(name = "idx_industry", columnList = "industry")
})
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistId;

    @NotBlank(message = "Artist name is required")
    private String artistName;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Gender is required")
    private Gender gender;

    @Min(value = 1, message = "Age must be at least 1")
    private int age;

    @NotBlank(message = "Nationality is required")
    private String nationality;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Industry is required")
    private Industry industry;

    // Getters and Setters

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    // toString() method
    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", industry=" + industry +
                '}';
    }
}