package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Owner;


public interface OwnerService {
	
	Set<Owner> findAll();
	Owner findById(Long id);

}
