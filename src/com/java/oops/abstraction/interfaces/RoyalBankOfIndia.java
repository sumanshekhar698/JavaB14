package com.java.oops.abstraction.interfaces;

public class RoyalBankOfIndia implements BankInterface{
	
	private final String name;
	private String bankName;
	protected long balance;//you cannot decrease the visiblity
	boolean hasLoan;
	private String ifscCode;
	
	

	public RoyalBankOfIndia(String name, long balance, boolean hasLoan, String ifscCode) {
		super();
		this.name = name;
		this.bankName = "RoyalBankOfIndia";
		this.balance = balance;
		this.hasLoan = hasLoan;
		this.ifscCode = ifscCode;
	}

	public long withdrawMoney(long amount) {
		if (balance < amount) {
			System.out.println("Insufficent Balance");
			return -1;

		} else {
			balance -= amount;
			return amount;
		}

	}

	public long depositMoney(long amount) {
		if (amount > 0) {
			balance += amount;
			return balance;

		} else {
			System.out.println("Incorrect Amount");
			return -1;

		}

	}

}
