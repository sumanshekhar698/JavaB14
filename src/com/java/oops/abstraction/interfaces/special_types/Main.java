package com.java.oops.abstraction.interfaces.special_types;

public class Main {

	public static void main(String[] args) {
//		1
		Bird b1 = new Bird() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("flyy");

			}
		};
		
//		2
		Eagle e1 = new Eagle();
		
//		3 Lambda fn
		Bird b2  = ()->{
			System.out.println("flyy");
		};

	}

}

class Eagle implements Bird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flyy");

	}
	
}
