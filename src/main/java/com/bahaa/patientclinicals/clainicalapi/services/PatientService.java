package com.bahaa.patientclinicals.clainicalapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahaa.patientclinicals.clainicalapi.models.Patient;
import com.bahaa.patientclinicals.clainicalapi.repositories.PatientRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	// Create a new patient
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	public Patient getPatientById(Long id) {
		Optional<Patient> patient = patientRepository.findById(id);
		return patient.orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
	}
}
