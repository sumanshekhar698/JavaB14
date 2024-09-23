package com.java.oops.encapsulation;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("John", 24, new Date(1994, 10, 10));//Epoch time
		System.out.println(st1);
		
//		System.out.println(st1.dob.getYear());
//		st1.dob = new Date(2000, 9, 10);
//		System.out.println(st1.dob.getYear());
		
		System.out.println(st1.getDob().getYear());
		

		
	}
}
