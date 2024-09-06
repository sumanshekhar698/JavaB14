package com.java.basics;

public class PrimitiveDataTypesInJava {

	public static void main(String[] args) {

//		numbers/integers [-2^(n-1)   to (2^(n-1)) - 1]
		byte a = 9;// 1 byte = 8 bits  ALGO 2s complement 
		short b = 89;// 2 byte = 16 bits
		int c = 8990;// 4 byte = 32 bits
		long d = 78997;// 8 byte = 64 bits

		long phoneNumber = 9_006_567_389L;
		
		int x = a;
//		a = c;

//		decimals/floating points

		float valueOfAPieFloat = 3.14159F;// 4 byte ALGO IEEE
		double valueOfAPieDouble = 3.14159;// 8 byte
		
		float phone  = phoneNumber;//Special Case
		System.out.println(phone);//9.006567E9  = 9.006567 * 10^9 = 9006567000

//		boolean
		boolean isJavaEasy = false;
		isJavaEasy = true;// 1 bit

//		character
		char ch = 'd';
		System.out.println(ch);

		int chInt = ch;
		System.out.println(chInt);

		char rupee = '₹';
		System.out.println((int) rupee);
		
		
//		Number System
		
//		Binary :: 2 symbols [0 1]
//		Octal :: 8 symbols [0 1 2 3 4 5 6 7]
//		Decimal :: 10 symbols [0 1 2 3 4 5 6 7 8 9]
//		Hexa decimal :: 16 symbols  [0 1 2 3 4 5 6 7 8 9 A B C D E F]
		
		int bin = 0b101010101;
		System.out.println(bin);//printing is always in Decimal format
		
		int oct = 01424237;
		System.out.println(oct);//printing is always in Decimal format
		
		long hex = 0x14242374356ABL;
		System.out.println(hex);//printing is always in Decimal format
		

		

	}
}
