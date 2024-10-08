package com.java.advanced.mutithreading;

public class VisiblityProblem {

	static volatile boolean flag = true;
	public static void main(String[] args) {


		Thread w4= new Thread(()->{
			while (flag) {
				System.out.println("STOP ME IF YOU CAN!!!");
			}
		});
		w4.start();
		

		Thread w5= new Thread(()->{
			flag = false;
		});
		w5.start();
		

	}

}
