package org.day4.ifelse;

public class Question4 {
	    public static void main(String[] args) {
	        int count = 0;
	        
	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 0) { // Check if the number is even
	                count++; // Increment the count of even numbers
	            }
	        }
	        
	        System.out.println("Count of even numbers from 1 to 100: " + count);
	    }
	}

