package com.bahaa.patientclinicals.clainicalapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String hello() {

		return "Bahaeldin Bahar";
	}
}
