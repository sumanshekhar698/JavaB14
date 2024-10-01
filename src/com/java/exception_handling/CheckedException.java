package com.java.exception_handling;

public class CheckedException {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 7; i++) {
			try {
				Thread.sleep(500);//Checked Exception
			} catch (InterruptedException e) {//Checked Exception
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}
}
