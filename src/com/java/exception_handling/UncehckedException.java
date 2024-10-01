package com.java.exception_handling;

import java.util.Scanner;

public class UncehckedException {

	public static void main(String[] args) {
		System.out.println("START");
		int arr[] = { 43, 23, 443, 3, 8 };
		int n = arr.length;

		Scanner sc = new Scanner(System.in);

//		UncehckedException :: if you want handle it else ignore
		try {//
			System.out.println(arr[n / sc.nextInt()]);// o/p Exception LOGICAL
//		} catch (ArrayIndexOutOfBoundsException e) {// Exception is the Parent class of all the Exceptions
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		} 
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {//JDK 8
			// Exception is the Parent class of all the Exceptions
			e.printStackTrace();
		} catch (Exception e) {// Default Exception Block should be at the end
			e.printStackTrace();
		} finally {
			System.out.println("finally!!");
			sc.close();
		}

		

		System.out.println("END");
	}

}
