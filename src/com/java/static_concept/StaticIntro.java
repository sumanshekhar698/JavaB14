package com.java.static_concept;

public class StaticIntro {

	public static void main(String[] args) {//StaticIntro.main(...)
		System.out.println(Student.collegeName);
		Student.sayMyName();
		
//		Student.counter = 1000000;
		Student st1 = new Student("Mary", 30, "DTU");
		Student st2 = new Student("James", 20, "IIT");
		Student st3 = new Student("Jack", 33, "NIT");
//
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
//		
//		st1.collegeName = "DIT";
//		System.out.println(st1.collegeName);
//		System.out.println(st3.collegeName);
//		
//		System.out.println(Student.collegeName);


	}

}
