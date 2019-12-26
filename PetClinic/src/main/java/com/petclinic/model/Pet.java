package com.petclinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	Petype petype;
	Owner owner;
	LocalDate date;
	
	public Petype getPetype() {
		return petype;
	}
	public void setPetype(Petype petype) {
		this.petype = petype;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
}
