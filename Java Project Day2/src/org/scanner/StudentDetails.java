package org.scanner;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		System.out.println("STUDENT DETAILS:-");
		System.out.println("-------------------");
		Scanner s = new Scanner(System.in);

		System.out.print("Student Id : ");
		String nextInt = s.nextLine();

		System.out.print("Student Name : ");

		String nextLine = s.nextLine();

		System.out.print("Email : ");
		String nextLine2 = s.nextLine();

		System.out.print("Phoneno : ");
		long nextLong = s.nextLong();
		s.nextLine();
		System.out.print("Department : ");
		String nextString = s.nextLine();
		System.out.print("Gender : ");

		String nextLine3 = s.nextLine();

		System.out.print("City : ");
		String nextLine4 = s.nextLine();
		System.out.println("Student Id : " + nextInt);
		System.out.println("Student Name :  " + nextLine);
		System.out.println("Email : " + nextLine2);
		System.out.println("Phoneno : " + nextLong);
		System.out.println("Department : " + nextString);
		System.out.println("Gender :  " + nextLine3);
		System.out.println("City : " + nextLine4);
	}

}
