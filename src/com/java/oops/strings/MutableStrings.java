package com.java.oops.strings;

public class MutableStrings {

	public static void main(String[] args) {

		// StringBuilder
		// StringBuffer :: MT

		StringBuilder sb = new StringBuilder("hey");
		System.out.println(sb);

		sb.append(" Hi !");
		sb.append(" Bye");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
	

	}

}
