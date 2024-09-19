package com.java.oops.arrays;

public class PassByValueAndRef {

	public static void main(String[] args) {
		int arr[] = { 4, 34, 43, 34, 43 };
//		System.out.println(arr[arr.length]);

		int x = 10;
		modify(x, arr);
		System.out.println(arr);
		System.out.println(x);
		System.out.println(arr[0]);

	}

	private static void modify(int y, int[] arrrrr) {//x is receiving the value
		System.out.println(arrrrr);
		y = 100000;
		arrrrr[0] = -999;

	}

}
