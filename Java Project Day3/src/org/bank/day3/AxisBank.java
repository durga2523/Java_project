package org.bank.day3;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
	System.out.println("Deposit is 40%");

}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.saving();
	a.fixed();
	a.deposit();
}
}
