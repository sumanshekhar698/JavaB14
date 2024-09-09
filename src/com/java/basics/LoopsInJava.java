package com.java.basics;

public class LoopsInJava {

	public static void main(String[] args) {

		int x = 9;// x is local to main fn
		// 1 - 100

//		simple for loop
		int i = 9;

		// iteration
		for (int j = 9, k = 0; i <= 100; i++, ++k) {// Initialization, condition, updation | j is local to the for loop

//			System.out.println(x);
			System.out.println(i);
		} // scope of variables

		System.out.println(i);//
//		1 Error 

//		for (;;) {
//			System.out.println("What!!");
//		}

		int n = 1;
		// while loop
		while (n <= 100) {
			System.out.println(n);
			++n;

		}

		do {// atleast execute for 1 time
			System.out.println("Heyy");
		} while (false);

		// TODO int n =5
//		fibonacci series till 30th term   0 1 1 2 3 5 8 13 21

	}

}
