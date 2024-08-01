package org.bank;

public class BankDetails {
	private void fullName() {
		System.out.println("Fullname : Durga devi.K");
	}

	private void sortCode() {
		System.out.println("SortCode :67775545");
	}

	private void accountNumber() {
		System.out.println("Account no :78643431176");
	}

	private void bankAddress() {
		System.out.println("Bank address :Chennai");
	}

	public static void main(String[] args) {
		BankDetails a = new BankDetails();
		a.fullName();
		a.sortCode();
		a.accountNumber();
		a.bankAddress();
	}
}
