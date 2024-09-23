package com.java.oops.polymorphism;

public class Shape {

	int areaOfSquare(int side) {
		return side * side;
	}

	int areaOfRectangle(int length, int breadth) {
		return length * breadth;
	}

	double areaOfCircle(double radius) {
//		return 3.14159 * radius * radius;
		return Math.PI * radius * radius;
	}

	float areaOfTriangle(float height, int base) {
		return 0.5f * height * base;
	}

	float areaOfParalleloGram(float height, int base) {
		return height * base;
	}

}
