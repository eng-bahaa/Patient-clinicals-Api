package com.bahaa.patientclinicals.clainicalapi.models;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinicaldata")
public class ClinicalData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "patient_id", nullable = false)
	private int patientId;
	@Column(name = "component_id", nullable = false)
	private int componentId;
	@Column(name = "component_name", nullable = false)
	private String componentName;
	@Column(name = "component_value", nullable = false)
	private String componentValue;
	@CreationTimestamp
	private Timestamp measuredDateTime;
	

	public ClinicalData() {
		// TODO Auto-generated constructor stub
	}

	public ClinicalData(int patientId, int componentId, String componentName, String componentValue,
			Timestamp measuredDateTime) {
		this.patientId = patientId;
		this.componentId = componentId;
		this.componentName = componentName;
		this.componentValue = componentValue;
		this.measuredDateTime = measuredDateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
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
		return "ClinicalData [id=" + id + ", patientId=" + patientId + ", componentId=" + componentId
				+ ", componentName=" + componentName + ", componentValue=" + componentValue + ", measuredDateTime="
				+ measuredDateTime + "]";
	}

}
