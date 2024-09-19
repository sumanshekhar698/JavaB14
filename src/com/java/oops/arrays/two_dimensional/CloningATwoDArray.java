package com.java.oops.arrays.two_dimensional;

public class CloningATwoDArray {

	
	public static void main(String[] args) {
		

		int [][][] d3 = new int [3][4][2];
		
		int[][] mat1 = { { 2, 6, 7 }, { 23, 1, 99 } };
	
		int [][] clone = new int[mat1.length][];
		
		for (int i = 0; i < mat1.length; i++) {
			clone[i] = mat1[i].clone();
		}
		
		for (int i = 0; i < clone.length; i++) {
			for (int j = 0; j < clone[i].length; j++) {
				System.out.print(clone[i][j] + " ");
			}
			System.out.println();
		}


	}
}
