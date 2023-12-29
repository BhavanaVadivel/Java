package com.kn.bean;

public class Laptop {
	int sNo;
	String manufacturer;
	double cost;
	public Laptop() {
		super();
	}
	public Laptop(int sNo, String manufacturer, double cost) {
		super();
		this.sNo = sNo;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
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
