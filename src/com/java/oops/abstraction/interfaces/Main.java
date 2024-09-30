package com.java.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {

		RoyalBankOfIndia royalBankOfIndia = new RoyalBankOfIndia("Jay", 1000, false, "RBSI67");
		BankInterface b1 = new BankInterface() {

			private String name;
			private String bankName;
			protected long balance;// you cannot decrease the visiblity
			boolean hasLoan;
			private String ifscCode;

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
		};
		

	}

}
