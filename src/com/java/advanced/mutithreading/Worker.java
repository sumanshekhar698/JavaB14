package com.java.advanced.mutithreading;

public class Worker extends Thread{//1  Worker

	
	@Override
	public void run() {//Work
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
				System.out.println(i + " " + Thread.currentThread());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
