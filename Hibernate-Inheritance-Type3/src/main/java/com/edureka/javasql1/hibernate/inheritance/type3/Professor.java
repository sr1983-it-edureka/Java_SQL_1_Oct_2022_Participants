package com.edureka.javasql1.hibernate.inheritance.type3;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
@PrimaryKeyJoinColumn(name = "id")
public class Professor extends Person{

	@Column(name = "job_type")
	private String jobType;
	
	@Column(name = "work_timings")
	private String workTimings;
	
	public Professor() {}
	
	public Professor(String name, int age, String jobType, String workTimings) {
		
		super(name, age);
		
		this.jobType = jobType;
		this.workTimings = workTimings;
	}
	
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getWorkTimings() {
		return workTimings;
	}
	public void setWorkTimings(String workTimings) {
		this.workTimings = workTimings;
	}
}
