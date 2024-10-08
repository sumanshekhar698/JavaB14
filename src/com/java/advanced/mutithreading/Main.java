package com.java.advanced.mutithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");

		
		Worker w1 = new Worker();//5
		w1.start();
		w1.setName("w1");
		w1.setPriority(10);//1 - 5 -10
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		Worker w2 = new Worker();
		w2.start();
		w2.setName("w2");
		
		Thread w3 = new Thread(new Work());
		w3.start();
		
		Thread w4= new Thread(()->{
			for (int i = 0; i < 15; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " " + Thread.currentThread());

			}
		});
		w4.start();
		
		
		for (int i = 0; i < 15; i++) {
			Thread.sleep(200);
			System.out.println(i + " " + Thread.currentThread());

		}
		

		

		

		System.out.println("END");

	}
	
//	private class Demo{
//		
//	}

}

class Work implements Runnable{//Work

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
