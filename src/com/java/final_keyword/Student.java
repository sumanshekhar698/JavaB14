package com.java.final_keyword;

public class Student {

	String id;
//	final String name = "";// instance var
	final String name;
	int age;

	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
