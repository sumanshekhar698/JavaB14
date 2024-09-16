package com.java.oops.constructors;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student();// constructor call
		System.out.println(st1.name);//
		System.out.println(st1);
		System.out.println(st1.returnSelf());

		Student st2 = new Student("John", 30, 1);
		System.out.println(st2.name);// John
		System.out.println(st2.age);// 30
		System.out.println(st2);//68837a77
		System.out.println(st2.hashCode());//1753447031
		
		

	}

}
