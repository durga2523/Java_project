package org.polymorphism;

//child class
public class IndianBank extends StateBank {
	public IndianBank() {
		System.out.println("INDIAN BANK");
	}

	public void deposit() {
		System.out.println("Deposit is 40%");

	}

	@Override
	public void Savings() {
		System.out.println("Savings is 80%");

	}

	public static void main(String[] args) {
		IndianBank i = new IndianBank();
		i.Savings();
		i.Loan();
		i.deposit();
	}

}
