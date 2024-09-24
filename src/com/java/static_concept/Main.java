package com.java.static_concept;

public class Main {// Singleton Design Pattern

	public static void main(String[] args) {// TODO
		PrimeMinister pm1 = new PrimeMinister("Mr Modi", 60);
		System.out.println(pm1);

		PrimeMinister pm2 = new PrimeMinister("Mr Rahul Gandhi", 40);
		System.out.println(pm2);

	}

}
