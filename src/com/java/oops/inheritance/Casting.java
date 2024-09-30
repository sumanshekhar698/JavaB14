package com.java.oops.inheritance;

public class Casting {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.y);
		c1.bar();
		c1.foo();

		Dad d1 = c1;// Upcasting is implicit
//		System.out.println(d1.y);
		System.out.println(d1.x);
		d1.foo();

		Dad d2 = new Child();

		// Downcasting WARNING!!
		Dad d3 = new Dad();
		if (d3 instanceof Child) {//safety check
			Child c2 = (Child) d3;// Downcasting is not IMPLICIT, you have to force it
		}
		
		
//	You can only downcast those things that are already upcasted
		Child c3 = (Child) d1;
		c3.bar();
		c3.foo();

	}

}

class Dad {

	int x = 9;

	void foo() {
		System.out.println("foo");
	}

}

class Child extends Dad {
	int y = 8;

	void bar() {
		System.out.println("bar");
	}

}
