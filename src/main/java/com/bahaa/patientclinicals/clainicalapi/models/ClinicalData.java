package com.bahaa.patientclinicals.clainicalapi.models;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinicaldata")
public class ClinicalData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id", nullable = false)
	private Long patientId;
	@Column(name = "component_id", nullable = false)
	private int componentId;
	@Column(name = "component_name", nullable = false)
	private String componentName;
	@Column(name = "component_value", nullable = false)
	private String componentValue;
	@CreationTimestamp
	private Timestamp measuredDateTime;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id", insertable = false, updatable = false)
	@JsonIgnore
	private Patient patient;

	public ClinicalData() {
		// TODO Auto-generated constructor stub
	}

	public ClinicalData(Long patientId, int componentId, String componentName, String componentValue,
			Timestamp measuredDateTime) {
		this.patientId = patientId;
		this.componentId = componentId;
		this.componentName = componentName;
		this.componentValue = componentValue;
		this.measuredDateTime = measuredDateTime;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public int getComponentId() {
		return componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentValue() {
		return componentValue;
	}

	public void setComponentValue(String componentValue) {
		this.componentValue = componentValue;
	}

	public Timestamp getMeasuredDateTime() {
		return measuredDateTime;
	}

	public void setMeasuredDateTime(Timestamp measuredDateTime) {
		this.measuredDateTime = measuredDateTime;
	}

	@Override
	public String toString() {
		return "ClinicalData [patientId=" + patientId + ", componentId=" + componentId
				+ ", componentName=" + componentName + ", componentValue=" + componentValue + ", measuredDateTime="
				+ measuredDateTime + "]";
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
