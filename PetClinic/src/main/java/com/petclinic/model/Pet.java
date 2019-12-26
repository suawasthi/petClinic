package com.petclinic.model;

import java.time.LocalDate;


public class Pet  extends BaseEntity{


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
