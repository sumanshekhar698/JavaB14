package com.java.basics;

public class OperatorsInJava {

	public static void main(String[] args) {

		// Assignment operator
		int x = 9;// Assignment operator

		// Arithmetic operators
		x = x * 6;// * + - / %
		System.out.println(8 / 4);// 2
		System.out.println(8 % 5);// 3

		int y = 78;
		y--;
		--y;
		System.out.println(y);
		// unary operators
		x = 10;
		System.out.println(x++);// 10 post increment
		System.out.println(x);// 11
		System.out.println(++x);// 12 pre increment
		System.out.println(x);// 12

		x = 10;
		System.out.println(x--);// 10
		System.out.println(x);// 9

		x = 10;
//		x= 10

//			= 9 + 9  - 9 - 9 + 10 = 10
		x = --x + x++ - --x - x++ + x--;
		System.out.println(x);

//		shorthand operators/notation

		x = 100;
//		x = x * 2;
		x *= 2;
		x -= 2;

//		bitwise operator
		// TODO
		System.out.println(16 & 58);// 16 to binary
//		58 to binary
//		& operator ==? decimal

		System.out.println(16 | 58);

		System.out.println(~98);

		System.out.println(19 ^ 19);

		//shifting bitwise operators
		System.out.println(80 >> 3);//80/ [2 * 2 *2]
		System.out.println(80 << 2);// 80 * 2

	}

}
