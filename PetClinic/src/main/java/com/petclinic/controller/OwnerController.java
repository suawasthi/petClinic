package com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	@RequestMapping("/owner")
	public String getIndex() {
		return "owner/ownerIndex";
	}
}
