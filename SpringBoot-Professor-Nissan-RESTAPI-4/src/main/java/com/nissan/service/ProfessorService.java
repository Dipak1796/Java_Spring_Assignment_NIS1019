package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IProfessorDAO;
import com.nissan.model.Professor;

@Service
public class ProfessorService implements IProfessorService{

	@Autowired
	IProfessorDAO professordao;
	
	@Override
	public List<Professor> getAllProfessor() {
		
		return professordao.findAll();
	}

	@Override
	public Professor getById(Integer Id) {
		Professor professor=professordao.findById(Id).get();
		return professor;
				
	}

	@Override
	@Transactional
	public Professor addProfessor(Professor p) {
		
		return professordao.save(p);
	}

	@Override
	public void deleteProfessor(Integer _professorId) {
		
		professordao.deleteById(_professorId);
		
	}

	@Override
	public Professor updateSalary(Integer _professorId, Double salary) {
		
		return professordao.updateSalary(_professorId, salary);
	}

}
