package com.java.oops;

public class Car {

//	instance/object variables :: instance = object
	int topSpeed;//0
	String brand;//null is the default value for every object is Java

	int colorR;//0
	int colorG;//0
	int colorB;//0
	float mielage;//0.0

	void move() {
		System.out.println("Car is moving at " + topSpeed + " kmph");
	}

	void carBreak() {
		System.out.println("Car stopped and the speed is 0 kmph");
	}

}
