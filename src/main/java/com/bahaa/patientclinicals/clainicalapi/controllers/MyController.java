package com.bahaa.patientclinicals.clainicalapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bahaa.patientclinicals.clainicalapi.models.Patient;

@RestController
public class MyController {

	private Patient paitent;

	@GetMapping("/")
	public String hello() {

		paitent = new Patient("Bahaa", "Bahar", 22);
		return "Bahaeldin Bahar + " + paitent.toString();
	}
}
