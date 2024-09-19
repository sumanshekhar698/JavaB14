package com.java.oops;

public class Main {

	int y;

	public static void main(String[] args) {

//		int x;// x is a local variable to main fn
//		x = 9;
//		System.out.println(x);

		Car c1 = new Car();// 1 car object | all teh intance variables will be initialized
//		Case 1 you are passing/initialize some value
//		case2 you are not passing/initializing some value :: they will get default values


		System.out.println(c1.brand);// null
		System.out.println(c1.topSpeed);
		System.out.println(c1.mielage);
		System.out.println();
//		245, 87, 66 RED Shade
		c1.brand = "Toyota";
		c1.colorB = 245;
		c1.colorG = 87;
		c1.colorB = 66;
		c1.mielage = 8;
		c1.topSpeed = 150;
		
		System.out.println(c1.brand);// null
		System.out.println(c1.topSpeed);
		System.out.println(c1.mielage);
		System.out.println();
		
		Car c2 = new Car();
		c2.brand = "Hyundai";
		c2.colorB = 245;
		c2.colorG = 87;
		c2.colorB = 66;
		c2.mielage = 8;
		c2.topSpeed = 150;

		
		System.out.println(c2.brand);// null
		System.out.println(c2.topSpeed);
		System.out.println(c2.mielage);
		
		
		c1.topSpeed =120;
		System.out.println(c2.topSpeed);
		
//		Car c3 = null;
//		System.out.println(c3.brand);
		
		c1 =null;
		
		Car c4 = c2;
		c4.brand = "Kia";
		System.out.println(c2.brand);
		
		c2 = null;
		System.gc();
	}

}
