package com.edureka.javasql1.hibernate.criteria;

import javax.persistence.*;

@Entity(name = "employee")
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "empno")
	private Long id;
	
	@Column(name = "ename")
	private String name;

	@Column(name = "job")
	private String job;

	@Column(name = "mgr")	
	private Integer mgr;
	
	@Column(name = "sal")	
	private Integer salary;
	
	@Column(name = "deptno")	
	private Integer deptNo;
		
	public Employee() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public Integer getMgr() {
		return mgr;
	}


	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public Integer getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	

	public String toString() {
		
		return String.format("ID %d, Name %s, Dept No %d, Salary %d", 
				id, name,deptNo, salary);
	}
}
