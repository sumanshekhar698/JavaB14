package com.java.oops.encapsulation;

import java.util.Date;

public class Student {

//	Least Restective

//	public
//	protected
//	default
//	private

//	Highest Restective

	private String name;
	int age;
	private Date dob;// private things can only be accessed DIRECTLY from within the class

	public Date getDob() {
		return dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int age, Date dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}

	private void sayMyName() {
		System.out.println("NAME : " + name);
	}

}
