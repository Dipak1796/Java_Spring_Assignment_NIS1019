package com.nissan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Professor;

@Repository
public interface IProfessorDAO extends JpaRepositoryImplementation<Professor, Integer> {

	@Query("update Professor set salary=?2 where profesorId=?1")
	public Professor updateSalary(Integer professorId,Double salary);
}
