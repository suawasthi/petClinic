package com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetClinicContolller {

	@RequestMapping({"/", ""})
	public String getFirstPage() {
		return "index";
	}
}
