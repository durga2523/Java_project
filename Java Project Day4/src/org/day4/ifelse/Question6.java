package org.day4.ifelse;

public class Question6 {
	    public static void main(String[] args) {
	        int number = 5;
	        
	        // Check if the number is non-negative
//	        if (number < 0) {
//	            System.out.println("Factorial is not defined for negative numbers.");
//	            return;
//	        }
//	        
	        // Initialize factorial to 1
	        int factorial = 1;
	        
	        // Calculate factorial
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	            System.out.println(i);
	        }
	        
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
	}


