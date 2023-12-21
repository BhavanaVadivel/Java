package com.kn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int productId;
	String productName;
	double cost;
	@ManyToOne
	Customer customer;
	public Product() {
		super();
	}
	public Product(int productId, String productName, double cost, Customer customer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.customer = customer;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + ", customer="
				+ customer + "]";
	}

	
}
