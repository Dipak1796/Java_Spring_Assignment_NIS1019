package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbleligibility")
public class Eligibility {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eligibilityId;
	private Integer courseId;
	private String eligibility;
	@JoinColumn(name="courseId",insertable=false,updatable=false)
	@ManyToOne
	private Course course;
	
	
	public Integer getEligibilityId() {
		return eligibilityId;
	}
	public void setEligibilityId(Integer eligibilityId) {
		this.eligibilityId = eligibilityId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	
	
}
