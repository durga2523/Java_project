package org.day4.ifelse;

public class Question9loop2 {

	    public static void main(String[] args) {
	        int rows = 5; // Change this to adjust the number of rows
	        
	        // Outer loop for rows
	        for (int i = 1; i <= rows; i++) {
	            // Inner loop for printing spaces before asterisks
	            for (int j = rows - i; j > 0; j--) {
	                System.out.print(" ");
	            }
	            // Inner loop for printing asterisks in each row
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println(); // Move to the next line after printing each row
	        }
	    }
	}


