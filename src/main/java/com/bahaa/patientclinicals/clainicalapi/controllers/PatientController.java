package com.bahaa.patientclinicals.clainicalapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bahaa.patientclinicals.clainicalapi.models.Patient;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@GetMapping("/patient")
	public String getPatient() {
		return "Bahaeldin Bahar";
	}

	// Get all patients
	@GetMapping
	public ResponseEntity<List<Patient>> getAllPatients() {
		List<Patient> patients = patientService.getAllPatients();
		return ResponseEntity.ok(patients);
	}

}
