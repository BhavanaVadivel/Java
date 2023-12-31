package com.hib.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int empId;
	String empName;
	String Team;
	
	@ManyToMany
	List<Technology> technology;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String team, List<Technology> technology) {
		super();
		this.empId = empId;
		this.empName = empName;
		Team = team;
		this.technology = technology;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public List<Technology> getTechnology() {
		return technology;
	}

	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Team=" + Team + ", technology=" + technology
				+ "]";
	}
	
	
}
