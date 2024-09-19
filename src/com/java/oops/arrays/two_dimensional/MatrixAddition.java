package com.java.oops.arrays.two_dimensional;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] mat1 = { { 2, 6, 7 }, { 23, 1, 99 } };

		int[][] mat2 = { { 546, 6, 45 }, { 45, 23, 56 } };

		int[][] resMat = null;
		if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {

			resMat = new int[mat2.length][mat2[0].length];
			for (int i = 0; i < resMat.length; i++) {
				for (int j = 0; j < resMat[i].length; j++) {
					System.out.print(resMat[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println();
			for (int i = 0; i < resMat.length; i++) {
				for (int j = 0; j < resMat[i].length; j++) {
					resMat[i][j] = mat1[i][j] + mat2[i][j];
				}
			}

		} else {
			System.out.println("Cannot do additon");
		}

		for (int i = 0; i < resMat.length; i++) {
			for (int j = 0; j < resMat[i].length; j++) {
				System.out.print(resMat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
