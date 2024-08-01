package org.scanner;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your age");
	byte nextByte = s.nextByte();
	System.out.println("My age is"+nextByte);
	System.out.println("Enter your ATM pin no");
	short nextShort = s.nextShort();
	System.out.println("My ATM pin no is "+nextShort);
	System.out.println("Enter your Id no");
	int nextInt = s.nextInt();
	System.out.println("My Id ni is"+nextInt);
	System.out.println("Enter your Phone no");
	long nextLong = s.nextLong();
	System.out.println("My Phone no"+nextLong);
	System.out.println("Enter your salary");
	float nextFloat = s.nextFloat();
	System.out.println("Salary is "+nextFloat);
	System.out.println("Condition true or false");
	boolean nextBoolean = s.nextBoolean();
	System.out.println(nextBoolean);
	System.out.println("To fetch particular string");
	char charAt = s.next().charAt(0);
	System.out.println("Index is"+charAt);
	System.out.println("Enter your name");
	String next = s.next();
	System.out.println("My name is "+next);
	System.out.println("Enter your name");
	String nextLine = s.nextLine();
	System.out.println("My name is name "+nextLine);
}
}
