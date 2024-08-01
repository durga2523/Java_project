package org.company.day3;

public class CompanyInfo {
	private void companyname(String name) {

		System.out.println(name);
	}

	private void companyname(String address, float salary) {
		System.out.println(address + "\n" + salary);
	}

	private void companyname(long comanyId) {
		System.out.println(comanyId);
	}

	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyname(31183947884l);
		c.companyname("ZOHO");
		c.companyname("CHENNAI", 59.7786f);
	}
}
