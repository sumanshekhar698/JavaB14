package com.java.oops.abstraction;

public class BankAccount {
	private final String name;
	private String bankName;
	private long balance;
	boolean hasLoan;
	private String ifscCode;

	public BankAccount(String name, long balance, boolean hasLoan, String ifscCode) {

		this.name = name;
		this.bankName = "Children Bank";
		this.balance = balance;
		this.hasLoan = hasLoan;
		this.ifscCode = ifscCode;
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

	public String getName() {
		return name;
	}

	public String getBankName() {
		return bankName;
	}

	public long getBalance() {
		return balance;
	}

	public boolean isHasLoan() {
		return hasLoan;
	}

	public String getIfscCode() {
		return ifscCode;
	}

}
