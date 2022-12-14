package com.nissan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nissan.model.Professor;


public interface IProfessorService {
	
	//get All Professor data
	public List<Professor> getAllProfessor();
	
	//get by id
	public Professor getById(Integer Id);
	
	//add professor
	public Professor addProfessor(Professor p);

	//delete professor
	public void deleteProfessor(Integer _professorId);
	
	//update salary
	public Professor updateSalary(Integer _professorId,Double salary);

}
