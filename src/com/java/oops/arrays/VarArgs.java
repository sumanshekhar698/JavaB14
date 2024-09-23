package com.java.oops.arrays;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		dummy("");
		dummy("", 43, 4, 3, 45, 4);

	}

	static void dummy(String word, int... nums) {// nums is a variable parameter argument
//		System.out.println(1);
		System.out.println(Arrays.toString(nums));
	}

//	static void dummy(int x, int y) {
//		System.out.println(2);
//
//	}

}
