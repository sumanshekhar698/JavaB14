package com.java.oops.arrays;

public class ArrayIntro {

	public static void main(String[] args) {
//		- Arrays are objects in Java
//		- Array Cannot grow or shrink

		int[] arr = new int[5];
		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		String arrStr[] = new String[10];
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();

		int[] numArr = { 32, 34, 4, 43, 34, 3, 4 };

		for (int num : numArr) {
			System.out.print(num + " ");
		}

		System.out.println();
		numArr[0] = 1000;
		for (int num : numArr) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int i = numArr.length - 1; i >= 0; i--) {
			System.out.print(numArr[i] + " ");
		}

	}

}
