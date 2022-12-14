package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Patient;
import com.nissan.service.IPatientService;

@RestController
@RequestMapping("api/")
public class PatientController {
	
	@Autowired
	IPatientService patientservice;
	
	@GetMapping("patients")
	public List<Patient> getAllPatient() {
		
		return patientservice.getAllPatient();
	}

	@GetMapping("patients/{_patientId}")
	public Patient getById(@PathVariable Integer _patientId) {
		return patientservice.getById(_patientId);
	}
	
	@PostMapping("patients")
	public void addPatient(@RequestBody Patient p)
	{
		patientservice.addPatient(p);
	}
	
	@DeleteMapping("patients/{_patientId}")
	public void deletePatient(@PathVariable Integer _patientId)
	{
		patientservice.deletePatient(_patientId);
	}

}
