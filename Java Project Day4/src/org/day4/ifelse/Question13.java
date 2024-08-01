package org.day4.ifelse;

public class Question13 {
	public static void main(String[] args) {
	        int number = 123; 
	        
	        int sum = 0;
	        int temp = number;

	        while (temp != 0) {
	            sum += temp % 10;
	            temp /= 10;
	        }

	        System.out.println("Sum of the number: " + sum);
	    }
	}


