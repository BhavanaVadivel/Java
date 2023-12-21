package com.kn.entity;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		ArrayList<Product> l1 = new ArrayList<Product>();
		l1.add(p1);
		l1.add(p2);
		ArrayList<Product> l2 = new ArrayList<Product>();
		l2.add(p3);
		l2.add(p4);
		
		Customer c1 = new Customer(1,"Arun",25,l1);
		Customer c2 = new Customer(2,"Asha",22,l2);
		
		p1.setProductId(111);
		p1.setProductName("KeyBoard");
		p1.setCost(1000);
		p1.setCustomer(c1);
		
		p2.setProductId(222);
		p2.setProductName("Mouse");
		p2.setCost(700);
		p2.setCustomer(c1);
		
		p3.setProductId(333);
		p3.setProductName("TV");
		p3.setCost(50000);
		p3.setCustomer(c2);
		
		p4.setProductId(444);
		p4.setProductName("Camera");
		p4.setCost(125000);
		p4.setCustomer(c2);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		//2.Build session factory using configuration
		SessionFactory sf = cfg.buildSessionFactory();
		//3.Open session using session factory
		Session s = sf.openSession();
		//4.Begin transaction using session
		Transaction txn = s.beginTransaction();
		
		s.save(c1);
		s.save(c2);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		s.save(p4);
		txn.commit();
	}

}
