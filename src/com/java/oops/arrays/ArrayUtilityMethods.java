package com.java.oops.arrays;

import java.util.Arrays;

public class ArrayUtilityMethods {

	public static void main(String[] args) {

		int arr[] = { 32, 21, 213, 21, 213, 231, 33, -33, 78, 0 };

		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);// Reverse this array
		System.out.println(Arrays.toString(arr));

//		Arrays.fill(arr, 1000);

		Arrays.fill(arr, 2, 5, 1000);
		System.out.println(Arrays.toString(arr));
		
		String str = "hey how are u ??";
		String[] split = str.split(" ");//REGEX
		System.out.println(Arrays.toString(split));

		
		
	}

}
