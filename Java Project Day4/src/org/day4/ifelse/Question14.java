package org.day4.ifelse;

public class Question14 {

	public static void main(String[] args) {
		int number = 141;

		int reversedNumber = 0;
		int originalNumber = number;

		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		if (originalNumber == reversedNumber) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
