package com.java.advanced.mutithreading;


public class SynchronizationProblem {

	
	public static void main(String[] args) {
//		PrimeMinister pm1 = new PrimeMinister("Mr Modi", 60);
		PrimeMinister pm1 = PrimeMinister.declarePm("Mr Modi", 60);
		System.out.println(pm1);

//		PrimeMinister pm2 = new PrimeMinister("Mr Rahul Gandhi", 40);
		PrimeMinister pm2 = PrimeMinister.declarePm("Mr Rahul Gandhi", 40);
		System.out.println(pm2);
	}
}
