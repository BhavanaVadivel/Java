package com.kn.entities;

public class Person {
	Mobile mobile;

	public Person() {
		super();
	}

	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [mobile=" + mobile + "]";
	}

}
