package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {
//		R2: you cannot create an object of a abstract class DIRECTLY
//		BankAbstraction bankAbstraction = new BankAbstraction();

		RoyalBank ac1 = new RoyalBank("Sam", 1000, false, "RB345");
		System.out.println(ac1.balance);

		ac1.withdrawMoney(200);
		System.out.println(ac1.balance);

		// Anonymous Inner Type
		BankAbstraction ac2 = new BankAbstraction("Simy", 1000, false, "RB345") {

			long withdrawMoney(long amount) {
				if (balance < amount) {
					System.out.println("Insufficent Balance");
					return -1;

				} else {
					balance -= amount;
					return amount;
				}

			}

			long depositMoney(long amount) {
				if (amount > 0) {
					balance += amount;
					return balance;

				} else {
					System.out.println("Incorrect Amount");
					return -1;

				}

			}
		};

		System.out.println(ac2.balance);

		ac2.withdrawMoney(2000);
		System.out.println(ac2.balance);

	}

}
