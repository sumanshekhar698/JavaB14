package com.java.oops.inheritance;

public class StaticWIthInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q q = new Q();
		q.foo();// Static fns gets inherited

		P.foo();
		Q.foo();

	}

}

class P {// inner class

	static void foo() {
		System.out.println("static foooooooo");
	}

}

class Q extends P {

//	@Override 
	static void foo() {// Method Hiding
		System.out.println("static ooooffffff");
	}
}

//Abstraction
//Exceptions
//Collections
//I/O
//MT