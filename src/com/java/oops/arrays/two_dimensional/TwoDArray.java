package com.java.oops.arrays.two_dimensional;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] matrix = new int[3][5];// 3*5

//		for (int i = 0; i < matrix.length; i++) {
//			System.out.println(Arrays.toString(matrix[i]));
//		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
