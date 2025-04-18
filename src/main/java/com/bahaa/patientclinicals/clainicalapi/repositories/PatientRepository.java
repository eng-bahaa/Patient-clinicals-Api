package com.bahaa.patientclinicals.clainicalapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.patientclinicals.clainicalapi.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {


}
