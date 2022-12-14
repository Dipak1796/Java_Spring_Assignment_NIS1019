package com.nissan.service;

import java.util.List;

import com.nissan.model.Patient;

public interface IPatientService {
	
	//List of All Patient
	public List<Patient> getAllPatient();
	
	//get patient by Id
	public Patient getById(Integer patientId);
	
	//Add patient
	public void addPatient(Patient p);
	
	//Update Patient
	public Patient updatePatient(Patient p);
	
	//delete Patient
	public void deletePatient(Integer id);

}
