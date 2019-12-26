package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Vet;


public interface VetService {

	Set<Vet> findAll();
	Vet findById(Long id);
	void save(Vet vet);
}
