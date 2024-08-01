package org.day4.ifelse;

public class Question11 {

	public static void main(String[] args) {
		int number = 123; // Change this to any number you want to reverse
		int reversedNumber = 0;

		// Reverse the number
		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		// Print the reversed number
		System.out.println("Reversed number: " + reversedNumber);
	}
}
