package com.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		//create();
		//read();
		update();
		//delete();
	}
	public static void create() {
		Laptop la = new Laptop(101,"Dell",56787.70);
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction txn = s.beginTransaction();
		s.save(la);
		txn.commit();
		System.out.println("Laptop has been created - "+la);
	}
	public static void read() {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction txn = s.beginTransaction();
		//To read
		Laptop la = s.get(Laptop.class,101);
		txn.commit();
		System.out.println("Laptop fetched from Database - "+la);
	}
	public static void update() {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction txn = s.beginTransaction();
		Laptop la = s.get(Laptop.class,111);
		la.setLaptopName("Lenovo");
		la.setCost(88700);
		txn.commit();
		System.out.println("Updated Successfully");
	}
	public static void delete() {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction txn = s.beginTransaction();
		Laptop la = s.get(Laptop.class,111);
		txn.commit();
		System.out.println("Laptop fetched from database - "+la);
	}
}
