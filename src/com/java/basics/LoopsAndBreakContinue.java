package com.java.basics;

public class LoopsAndBreakContinue {

	public static void main(String[] args) {

//		for (int i = 0; i < 100; i++) {
//			if (i == 48)
//				break;
//
//			System.out.println(i);
//
//		}

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				continue;

			System.out.println(i);

		}

	}

}
