package org.array;

public class Array2 {
	 public static void main(String[] args) {
	        // Input array
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        // Variable to store the sum
	        int sum = 0;
	        

	        // Iterate through the array and add each element to the sum
	        for (int num : array) {
	            sum += num;
	        }

	        // Calculate the average
	        double average = (double) sum / array.length;

	        // Print the average
	        System.out.println("Average of array elements: " + average);
	    }
	        
}
