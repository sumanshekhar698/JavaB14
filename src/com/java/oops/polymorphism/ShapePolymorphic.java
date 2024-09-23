package com.java.oops.polymorphism;

public class ShapePolymorphic {

//	The fn name should be same

//	Make it unique
//	1. No of parameters
//	2. Type of Parameters
//	3. Parameter position
//	Return  type does not play any role in Polymorphism

	
//	Java will know which fn to call at compile time
//	area is overloaded
	
//	Method/Fn overloading is resolved in compiled time :: Compile Time Polymorphism
	
//	Compile Time Polymorphism
//	Runtime Polymorphism
	
	int area(int side) {
		return side * side;
	}

	int area(int length, int breadth) {
		return length * breadth;
	}

	double area(double radius) {
//		return 3.14159 * radius * radius;
		return Math.PI * radius * radius;
	}

	float area(float height, int base) {
		return 0.5f * height * base;
	}

	float area(int base, float height) {
		return height * base;
	}

}
