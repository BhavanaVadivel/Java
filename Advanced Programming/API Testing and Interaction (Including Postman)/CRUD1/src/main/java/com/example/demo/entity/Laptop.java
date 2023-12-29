package com.example.demo.entity;

public class Laptop {
	String sNo;
	String manufacturer;
	double cost;
	public Laptop() {
		super();
	}
	public Laptop(String sNo, String manufacturer, double cost) {
		super();
		this.sNo = sNo;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [sNo=" + sNo + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}

	
}
