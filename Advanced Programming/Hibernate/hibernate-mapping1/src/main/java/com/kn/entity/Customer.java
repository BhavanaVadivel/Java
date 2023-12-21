package com.kn.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Customer {
	@Id
	int customerId;
	String customerName;
	int age;
	@OneToMany
	List<Product> products;
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, int age, List<Product> products) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.products = products;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age + ", products="
				+ products + "]";
	}
	
	
}
