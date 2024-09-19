package com.java.oops.arrays;

public class CloningArray {

	public static void main(String[] args) {

		int arr[] = { 32, 21, 213, 21, 213, 231, 33, -33, 78, 0 };

//		int cloned [] = arr;

		int cloned[] = new int[arr.length];

		int i = 0;
		for (int num : arr) {
			cloned[i++] = num;
		}
		
		System.out.println();

		for (int num : cloned) {
			System.out.print(num + " ");
		}

		arr[0] = 898;

		System.out.println();
		System.out.println(cloned[0]);
		
		
		
		int[] clone = arr.clone();//WARNING Use only for 1D array

	}

}
