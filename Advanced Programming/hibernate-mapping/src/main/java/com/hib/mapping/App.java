package com.hib.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Bike;
import com.hib.entity.Student;

public class App {
	public static void main(String[] args) {
		//Bike b1 = new Bike(1111,"Royal Enfield",269000.00);
		//Bike b2 = new Bike(7777,"Pulsar",80450.96);
		//Bike b3 = new Bike(9999,"KTM",170450.56);
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		
		Student s1 = new Student(1,"Aarthi",92,b2);
		Student s2 = new Student(2,"Arun",82,b3);
		Student s3 = new Student(3,"Nithya",87,b1);
		
		b1.setR_no(1111);
		b1.setModel("Royal Enfield");
		b1.setCost(269000.00);
		b1.setStudent(s3);
		b2.setR_no(2222);
		b2.setModel("Pulsar");
		b2.setCost(80450.96);
		b2.setStudent(s1);
		b3.setR_no(3333);
		b3.setModel("KTM");
		b3.setCost(170450.56);
		b3.setStudent(s2);

		//1.Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure();
		//2.Build session factory using configuration
		SessionFactory sf = cfg.buildSessionFactory();
		//3.Open session using session factory
		Session s = sf.openSession();
		//4.Begin transaction using session
		Transaction txn = s.beginTransaction();

		s.save(b1);
		s.save(b2);
		s.save(b3);
		s.save(s1);
		s.save(s2);
		s.save(s3);	

		//5.Commit the transaction
		txn.commit();
		//System.out.println("-----> "+s1+" has been stored in the Database!");
		System.out.println("Data has been stored in the Database");
	}
}
