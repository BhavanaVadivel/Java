package com.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Aarthi",92);
		Student s2 = new Student(2,"Arun",82);
		Student s3 = new Student(3,"Nithya",87);
		Student s4 = new Student(4,"Shreya",99);
		Student s5 = new Student(5,"Vivek",89);
		
		Bike b1 = new Bike(1111,"Royal Enfield",269000.00);
		Bike b2 = new Bike(7777,"Pulsar",80450.96);
		
		//1.Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure();
		//2.Build session factory using configuration
		SessionFactory sf = cfg.buildSessionFactory();
		//3.Open session using session factory
		Session s = sf.openSession();
		//4.Begin transaction using session
		Transaction txn = s.beginTransaction();
	
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		
		s.save(b1);
		s.save(b2);
		//5.Commit the transaction
		txn.commit();
		//System.out.println("-----> "+s1+" has been stored in the Database!");
		System.out.println("Data has been stored in the Database");
	}

}
