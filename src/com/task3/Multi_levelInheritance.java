package com.task3;
//child class
public class Multi_levelInheritance extends SingleInheritance2 {
	private void clientId() {
		System.out.println("Client ID 4321");

	}
 private void clientName() {
	System.out.println("Client Name Devi");

}
	public static void main(String[] args) {
		Multi_levelInheritance d=new Multi_levelInheritance();
		d.clientId();
		d.clientName();
		d.companyName();
		d.companyaddress();
		d.employeId();
		d.employeeAddress();
	}

}
