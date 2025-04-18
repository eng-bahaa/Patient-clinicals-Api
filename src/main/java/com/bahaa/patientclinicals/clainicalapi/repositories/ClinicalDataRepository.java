package com.bahaa.patientclinicals.clainicalapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.patientclinicals.clainicalapi.models.ClinicalData;

@Repository
public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Long> {

}
