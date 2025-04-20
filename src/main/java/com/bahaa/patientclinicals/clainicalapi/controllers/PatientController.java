package com.bahaa.patientclinicals.clainicalapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bahaa.patientclinicals.clainicalapi.models.Patient;
import com.bahaa.patientclinicals.clainicalapi.services.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	// Get patient by ID
	@GetMapping("/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
		Patient patient = patientService.getPatientById(id);
		return ResponseEntity.ok(patient);
	}

	// Get all patients
	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> getAllPatients() {
		List<Patient> patients = patientService.getAllPatients();
		return ResponseEntity.ok(patients);
	}


}
