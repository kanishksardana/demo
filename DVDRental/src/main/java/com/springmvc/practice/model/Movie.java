package com.springmvc.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private Long id;
	private String name ;
	private String description;
	private int releaseYear;
	private int rentalRate;
	
	public String getDescription() {
		return description;
	}
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public int getRentalRate() {
		return rentalRate;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public void setRentalRate(int rentalRate) {
		this.rentalRate = rentalRate;
	}
	

}
