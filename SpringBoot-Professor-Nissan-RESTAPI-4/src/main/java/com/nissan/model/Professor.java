package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblprofessor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer professorId;
	private Integer managerId;
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	private Integer deptno;
	private Double salary;
	private LocalDate doj;
	private LocalDate dob;
	private String gender;
	private Boolean isActive;
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(Integer professorId, Integer managerId, String firstName, String lastName, Integer deptno,
			Double salary, LocalDate doj, LocalDate dob, String gender, Boolean isActive) {
		super();
		this.professorId = professorId;
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptno = deptno;
		this.salary = salary;
		this.doj = doj;
		this.dob = dob;
		this.gender = gender;
		this.isActive = isActive;
	}

	public Integer getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", managerId=" + managerId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", deptno=" + deptno + ", salary=" + salary + ", doj=" + doj + ", dob="
				+ dob + ", gender=" + gender + ", isActive=" + isActive + "]";
	}
	
	
	
	
	
	
	
	
	

}
