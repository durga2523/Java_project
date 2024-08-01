package org.emp;

public class EmployeeInfo {
	private void empId() {
		System.out.println("ID is 1234");
	}

	private void empName() {
		System.out.println("Name is Durga");
	}

	private void empDob() {
		System.out.println("DOB is 25-09-2003");
	}

	private void empPhone() {
		System.out.println("Phone no is 9626020826");
	}

	private void empEmail() {
		System.out.println("Email is durgadevi96260@gmail.com");
	}

	private void empAddress() {
		System.out.println("Address is Kallakurichi");
	}

	public static void main(String[] args) {
		EmployeeInfo a = new EmployeeInfo();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
	}

}
