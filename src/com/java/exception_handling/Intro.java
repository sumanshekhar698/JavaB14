package com.java.exception_handling;

public class Intro {

	static int counter = 0;
	public static void main(String[] args) {
		System.out.println("START");

		int arr[] = { 43, 23, 23, 3, 8 };
		
		System.out.println(arr[arr.length]);//o/p Exception LOGICAL
		// The code didn't complete smoothly
		/* Exceptions 
		 * - Unchecked
		 * - Checked
		 * */
		
		
//		Error is more on the resource side
		callMe();//Recursion ?
		System.out.println("END");

	}
	
	
	private static void callMe() {
		System.out.println(++counter);
		callMe();
	}

}
