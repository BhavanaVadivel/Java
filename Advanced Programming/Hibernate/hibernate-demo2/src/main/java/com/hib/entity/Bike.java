package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "register")
public class Bike {
	@Id
	int r_no;
	String model;
	double cost;
	
	public Bike() {
		super();
	}

	public Bike(int r_no, String model, double cost) {
		super();
		this.r_no = r_no;
		this.model = model;
		this.cost = cost;
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

	@Override
	public String toString() {
		return "Bike [r_no=" + r_no + ", model=" + model + ", cost=" + cost + "]";
	}
}
