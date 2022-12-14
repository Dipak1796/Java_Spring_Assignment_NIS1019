package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IPatientDAO;
import com.nissan.model.Patient;

@Service
public class PatientServiceImplementation implements IPatientService{
	
	@Autowired
	IPatientDAO patientdao;

	@Override
	public List<Patient> getAllPatient() {
	
		return patientdao.findAll();
	}

	@Override
	public Patient getById(Integer patientId) {
		Patient patient=patientdao.findById(patientId).get();
		return patient;

	}

	@Override
	public void addPatient(Patient p) {
		patientdao.save(p);
		
	}

	@Override
	@Transactional
	public Patient updatePatient(Patient p) {
		
		return patientdao.save(p);
	}

	@Override
	public void deletePatient(Integer id) {

      Patient p=patientdao.getById(id);
      patientdao.delete(p);
		
	}
	
	

}
