package com.bahaa.patientclinicals.clainicalapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.patientclinicals.clainicalapi.models.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

	// create patient repository


}
