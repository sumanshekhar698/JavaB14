package com.java.static_concept;

public class Student {

	String id;// ST1 ST2 ST3
	String name;// instance variable
	int age;// instance variable

	private static int counter = 0;// static variable
	static String collegeName = "NIT";// static things are not object level :: they belong to class

	{
		System.out.println("normal block 0 <<");
		System.out.println("normal block 0 >>");
	}

	static {
		System.out.println("static block 1 <<");
		collegeName = "IIT";
		System.out.println("static block 1 >>");

	}

	{
		System.out.println("normal block 1 <<");
		System.out.println("normal block 1 >>");
	}

	static {
		System.out.println("static block 2 <<");
		System.out.println("static block 2 >>");

	}

	public Student(String name, int age, String collegeName) {
		System.out.println("constructor <<");

		this.id = "ST" + ++counter;

		this.name = name;
		this.age = age;
		Student.collegeName = collegeName;
		System.out.println("constructor >>");
		sayMyName();

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	static void sayMyName() {// R1: non static things cannot be accessed inside static context directly
//		but vice versa is not true

//		System.out.println(age);
		System.out.println(collegeName);
	}

}
