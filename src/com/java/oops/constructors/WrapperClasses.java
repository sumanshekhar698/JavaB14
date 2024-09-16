package com.java.oops.constructors;

public class WrapperClasses {

	public static void main(String[] args) {

		int x = 7;// Primitive Datatype
		System.out.println(x);
//		x is a object?

		char ch = 'A';

		// Wrapper Clases
		Integer xObject = new Integer(x);

		System.out.println(xObject);

		Character chObject = new Character('H');

		Integer y = x;// AutoBoxing

		int m = y;// AutoUnboxing
		Character ch1 = 'K';

	}

}
