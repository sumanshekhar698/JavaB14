package com.java.oops.constructors;

public class Student {

	String name;
	int age;
	int id;

	/*
	 * - its is like a fn/method but not exactly 
	 * - it will not have a return type 
	 * - constructor name should EXACTLY match the class name 
	 * - this is automatically called while object creation & you can call it later.
	 * - Its generally used to initialize instance variables | pre word while object creation
	 */

	// if there is 0 explicit constructor the Java will create one default
	// constructor in runtime

//	Explicit Constructor
//	Non parameterized constructor
	Student() {// Constructor
//		this(3); |AVOID loops
		System.out.println("Student() <<");

	}

	Student(String name, int age, int id) {// Parameterized Constructor

//		Constructor Chaining
		this(id);// this should be the 1st statement inside constructor

		System.out.println("Student(name,age) <<");
		this.name = name;
		this.age = age;// Shadow Problem
//		this will always point to the current object
	}

	Student(int id) {// Parameterized Constructor
		this();
		System.out.println("Student(id) <<");
		this.id = id;
	}

	void sayMyName() {

	}
	
	Student returnSelf(){
		return this;// this holds the reference of the current object
	}

}
