package com.java.advanced.io.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient private String name;
	int id;

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

}
