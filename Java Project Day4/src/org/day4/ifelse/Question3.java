package org.day4.ifelse;

public class Question3 {
	    public static void main(String[] args) {
	        int sum = 0;
	        
	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 != 0) { // Check if the number is odd
	                sum += i; // Add the odd number to the sum
	            }
	        }
	        
	        System.out.println("Sum of odd numbers from 1 to 100: " + sum);
	    }
	}


