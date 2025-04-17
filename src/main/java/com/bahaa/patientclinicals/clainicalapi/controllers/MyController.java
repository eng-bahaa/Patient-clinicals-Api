package com.bahaa.patientclinicals.clainicalapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bahaa.patientclinicals.clainicalapi.models.Paitent;

@RestController
public class MyController {

	private Paitent paitent;

	@GetMapping("/")
	public String hello() {

		paitent = new Paitent("Bahaa", "Bahar", 22);
		return "Bahaeldin Bahar + " + paitent.toString();
	}
}
