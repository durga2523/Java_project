package org.exception3;

public class Test {
public static void main(String[] args) {
	try {
		System.out.println("1");
		int data=5/0;
	} catch (ArithmeticException e) {
		System.out.println("2");
		System.exit(0);//Terminate(Stop) the program
	}
	finally {
		System.out.println("3");
	}
	System.out.println("4");
}
}
