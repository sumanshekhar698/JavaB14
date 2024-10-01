package com.java.exception_handling;

import java.util.Scanner;

public class TryFinally {
	public static void main(String[] args) {
		System.out.println("START");
		int arr[] = { 43, 23, 443, 3, 8 };
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		try {//AutoClosable
			System.out.println(arr[n / sc.nextInt()]);// o/p Exception LOGICAL
		}finally {
			System.out.println("finally!!");
			sc.close();
		}
		System.out.println("END");
	}
}
