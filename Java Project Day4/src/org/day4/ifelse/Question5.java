package org.day4.ifelse;

public class Question5 {
	public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100: ");
        
//        for (int i = 2; i <= 100; i += 2) {
//            System.out.print(i);
//            
//            // Add comma and space if it's not the last even number
//            if (i < 100) {
//              System.out.print(", ");
        for (int i = 1; i <=100; i++) {
			if(i%2==0) {
				System.out.println(i);
		
            }
			
        }
    }
}
