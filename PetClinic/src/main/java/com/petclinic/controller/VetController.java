package com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping("/vets")
	public String getIndex() {
		return "vets/vetIndex";
	}
}
