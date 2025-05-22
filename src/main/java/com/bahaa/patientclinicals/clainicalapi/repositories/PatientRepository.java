package com.bahaa.patientclinicals.clainicalapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.patientclinicals.clainicalapi.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	// Find patients by first and last name
	List<Patient> findByFirstNameAndLastName(String firstName, String lastName);
}
