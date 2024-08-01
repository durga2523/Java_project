package org.company;

public class Company {
	private void companyName() {
		System.out.println("Company name is ZOHO ");

	}
	private void companyId() {
		System.out.println("Company ID is 83748678 ");

	}
	private void companyAddress() {
		System.out.println("Company Address is Chennai ");

	}
	public static void main(String[] args) {
		Company c= new Company();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}
