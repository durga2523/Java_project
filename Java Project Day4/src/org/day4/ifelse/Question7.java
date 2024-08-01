package org.day4.ifelse;

public class Question7 {
	    public static void main(String[] args) {
	        int limit = 100;
	        int a = 0, b = 1;
	        int i=1;
	        	        
	        System.out.print("Fibonacci series up to " + limit + ": ");
	        System.out.print(a + ", " + b); // Print the first two numbers
	        
	        while (i<=limit) {
	          int c=a+b;
	          
	          
	            
	            if (c > limit) {
	                break; // Break the loop if the next Fibonacci number exceeds the limit
	            }
	            
	            System.out.print(", " + c);
	            a = b;
	            b = c;
	        }
	    }
	}



