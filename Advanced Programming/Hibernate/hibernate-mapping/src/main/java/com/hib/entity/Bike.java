package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Bike {
	@Id
	int r_no;
	String model;
	double cost;
	
	@OneToOne
	Student student;

	public Bike() {
		super();
	}

	public Bike(int r_no, String model, double cost, Student student) {
		super();
		this.r_no = r_no;
		this.model = model;
		this.cost = cost;
		this.student = student;
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Bike [r_no=" + r_no + ", model=" + model + ", cost=" + cost + ", student=" + student + "]";
	}

	
	
}

