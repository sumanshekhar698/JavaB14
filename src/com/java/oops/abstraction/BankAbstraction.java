package com.java.oops.abstraction;

abstract public class BankAbstraction {//If you have any abstratc fnb in the class, you have to make the class abstract
	private final String name;
	private String bankName;
	protected long balance;//you cannot decrease the visiblity
	boolean hasLoan;
	private String ifscCode;

	public BankAbstraction(String name, long balance, boolean hasLoan, String ifscCode) {

		this.name = name;
		this.bankName = "Children Bank";
		this.balance = balance;
		this.hasLoan = hasLoan;
		this.ifscCode = ifscCode;
	}

	abstract long withdrawMoney(long amount);//Abstract fn/methods

	abstract long depositMoney(long amount);

	public String getName() {
		return name;
	}

	public String getBankName() {//Concrete fn/methods
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
