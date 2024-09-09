package com.java.basics;

public class Condtionals2 {

	public static void main(String[] args) {

		int x = 9;

		// if else if ladder
		if ((x >= 1) && (x <= 10)) {// boolean
			System.out.println("1 to 10");
		} else if ((x >= 11) || (x <= 20)) {
			System.out.println("11 to 20");

		}	
		else if ((x >= 21) && (x <= 30)) {
			System.out.println("21 to 30");

		} else {
			System.out.println("Out of range");
		}

		
		
		x = -3;

		if (!((x >= 1) && (x <= 10))) {// boolean
			System.out.println("1 to 10");
		}
		x = 13;

		if ((x >= 11) && (x <= 20)) {
			System.out.println("11 to 20");

		}
		x = 23;
		if ((x >= 21) && (x <= 30)) {
			System.out.println("21 to 30");

		} else {
			System.out.println("Out of range");
		}

	}

}
