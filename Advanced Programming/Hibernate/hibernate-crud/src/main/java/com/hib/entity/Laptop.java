package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int no;
	String laptopName;
	double cost;
	public Laptop() {
		super();
	}
	public Laptop(int no, String laptopName, double cost) {
		super();
		this.no = no;
		this.laptopName = laptopName;
		this.cost = cost;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [no=" + no + ", laptopName=" + laptopName + ", cost=" + cost + "]";
	}
	
	
}
