package com.java.oops.abstraction;

public class RoyalBank extends BankAbstraction{

	public RoyalBank(String name, long balance, boolean hasLoan, String ifscCode) {
		super(name, balance, hasLoan, ifscCode);
	}

	
	
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



	@Override
	public String toString() {
		return "RoyalBank [balance=" + balance + ", hasLoan=" + hasLoan + "]";
	}
	
	
}
