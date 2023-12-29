package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Laptop;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Laptop l1 = (Laptop)context.getBean("l1");
		System.out.println(l1);
		Laptop l2 = (Laptop)context.getBean("l2");
		System.out.println(l2);
		Laptop l3 = (Laptop)context.getBean("l3");
		System.out.println(l3);
	}

}
