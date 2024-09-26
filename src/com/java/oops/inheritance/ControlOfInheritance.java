package com.java.oops.inheritance;

public class ControlOfInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent {
	
	private int age;//R3: private things cannot be inherited be it fn/intance variable

	final void foo(){//R2:  final fn/methods cannot be overriden
		System.out.println("foo");
	}
}

final class Child1 extends Parent {//R1: final classes cannot be inherited
	
//	@Override//
//	void foo(){
//		System.out.println("foooooooooo");
//	}
	
//	void bar() {
//		System.out.println(age);//private things cannot be inherited be it fn/intance variable
//	}
}

//class Child2 extends Child1 {
//
//}
