package com.java.advanced.mutithreading;

public class PrimeMinister {

	String name;
	int age;
	private static PrimeMinister pm;

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

	private PrimeMinister(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	this meyhod/fn can be accessed by a Single thread at a time
	synchronized static PrimeMinister declarePm(String name, int age) {

		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}

		return pm;
	}

}
