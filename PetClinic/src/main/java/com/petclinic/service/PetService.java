package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Pet;


public interface PetService {

	Set<Pet> findAll();
	Pet findByID(Long id);
	
}
