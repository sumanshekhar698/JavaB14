package com.java.oops.arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] numArr = { 32, 34, 4, 43, 34, 3, 4 };
//		int[] revArr = new int[numArr.length];
//
//		for (int i = numArr.length - 1, j = 0; i >= 0; i--, j++) {
//			revArr[j] = numArr[i];
//		}

		int i = 0, j = numArr.length - 1;
		while (i <= j) {// n/2

			int temp = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = temp;

			i++;
			j--;

		}
		
		//DSA = Logic + Coding

		for (int num : numArr) {
			System.out.print(num + " ");
		}
		System.out.println();

//		for (int num : revArr) {
//			System.out.print(num + " ");
//		}

	}

}
