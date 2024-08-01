package org.bank1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit ");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
	}
	

}
