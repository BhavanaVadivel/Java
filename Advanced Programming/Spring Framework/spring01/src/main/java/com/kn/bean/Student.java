package com.kn.bean;

public class Student {
	int rollNum;
	String name;
	int marks;
	public Student() {
		super();
	}
	public Student(int rollNum, String name, int marks) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
