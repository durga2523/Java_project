package org.scanner;

import java.util.Scanner;

public class EmployeeScannerclass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("EMPLOYEE DETAILS:-");
		System.out.println("-------------------");
		System.out.println("Employee Id");
		int nextInt = s.nextInt();
		System.out.println("My ID is "+nextInt);
		System.out.println("Employee Name");
		s.nextLine();
		String nextLine = s.nextLine();
		System.out.println("My name is "+nextLine);
		System.out.println("Employee Email");
		String nextLine2 = s.nextLine();
		System.out.println("My email is "+nextLine2);
		System.out.println("employee Phoneno");
		long nextLong = s.nextLong();
		System.out.println("My phone no is "+nextLong);
		System.out.println("Employee Salary");
		float nextFloat = s.nextFloat();
		System.out.println("My Salary is "+nextFloat);
		System.out.println("Employee gender");
		s.nextLine();
		String nextLine3 = s.nextLine();
		System.out.println("My gender is "+nextLine3);
		System.out.println("Employee city");
		String nextLine4 = s.nextLine();
		System.out.println("My city is "+nextLine4);
		
	}

}
