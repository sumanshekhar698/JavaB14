package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape.areaOfCircle(5));
		System.out.println(shape.areaOfTriangle(0.5f, 10));

		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.area(10));
		System.out.println(shapePolymorphic.area(10.0f));
		System.out.println();// prinln is overloaded

	}

	public static void main(Integer[] args) {// main is overlaoded
	}

}
