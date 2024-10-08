package com.java.advanced.mutithreading;

public class ThreadJoin {

	public static void main(String[] args) {
		System.out.println("START");
		System.out.println("main " + Thread.currentThread().getState());
		
		Thread w4= new Thread(()->{
			for (int i = 0; i < 15; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " " + Thread.currentThread() + " " + Thread.currentThread().getState());

			}
		});
		System.out.println("w4 " + w4.getState());

		
		w4.start();
		
		try {
			w4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("w4 " + w4.getState());

		
		System.out.println("main" + Thread.currentThread().getState());


		System.out.println("END");
		System.out.println("w4 " + w4.getState());

	}

}
