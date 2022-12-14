package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Professor;
import com.nissan.service.IProfessorService;

@RestController
@RequestMapping("api/")
public class ProfessorController {
	
	@Autowired
	IProfessorService profservice;
	
	@GetMapping("professors")
	public List<Professor> getAll(){
		return profservice.getAllProfessor();
	}
	
	@GetMapping("professors/{_profId}")
	public Professor getById(@PathVariable Integer _profId) {
		return profservice.getById(_profId);
	}
	
	@PostMapping("professors")
	public Professor addPatient(@RequestBody Professor professor)
	{
		return profservice.addProfessor(professor);
	}
	
	@DeleteMapping("professors/{_professorId}")
	public void deleteProfessor(@PathVariable Integer _professorId) {
		profservice.deleteProfessor(_professorId);
	}
	
	@PutMapping("professors/{_professorId}&{salary}")
	public Professor updateSalary(@PathVariable Integer _professorId ,Double salary)
	{
		return profservice.updateSalary(_professorId, salary);
	}

}
