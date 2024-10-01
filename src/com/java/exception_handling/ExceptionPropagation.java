package com.java.exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) throws InterruptedException {//JVM DEH

		callA();

	}

	private static void callA() throws InterruptedException {
		System.out.println("A");
		callB();

	}

	private static void callB() throws InterruptedException {
		System.out.println("B");
		callC();
	}

	private static void callC() throws InterruptedException {
		System.out.println("C");

		int x = 9/0;
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(500);

		}
	}

}
