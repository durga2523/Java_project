package org.day4.ifelse;

public class Ouestion10 {
	    public static void main(String[] args) {
	        int number = 153; // Change this to any number you want to check
	        
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrong(int num) {
	    	
	        int originalNumber = num;
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit * digit * digit;
	            num /= 10;
	        }

	        return originalNumber == sum;
	    }
	}


