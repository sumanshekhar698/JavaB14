package com.java.oops.arrays.two_dimensional;

public class UnsymetricalTwoDArray {

	public static void main(String[] args) {

		int[][] jaggedTwoDArray = { 
				 { 2, 6, 7, 8, 9 }, 
				 { 23, 1, 99 }, 
				 { 23, 1 } };
		
		
		int[][]  jaggedTwoDArray2=  new int[3][];
		jaggedTwoDArray2[0] = new int[5];
		jaggedTwoDArray2[1] = new int[3];

		jaggedTwoDArray2[2] = new int[2];

		
		for (int i = 0; i < jaggedTwoDArray2.length; i++) {
			for (int j = 0; j < jaggedTwoDArray2[i].length; j++) {
				System.out.print(jaggedTwoDArray2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		
		
		

		for (int i = 0; i < jaggedTwoDArray.length; i++) {
			for (int j = 0; j < jaggedTwoDArray[i].length; j++) {
				System.out.print(jaggedTwoDArray[i][j] + " ");
			}
			System.out.println();
		}


	}

}
