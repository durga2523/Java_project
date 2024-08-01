package org.string;

public class Count1 {
public static void main(String[] args) {
	String w="Welcome To Java class @123";
	int caps  =0;
	int small =0;
	 int number=0;
	 int Special =0;
	 for (int i = 0; i < w.length(); i++) {
		 char c = w.charAt(i);

         if (Character.isUpperCase(c)) {
             caps++;
         } else if (Character.isLowerCase(c)) {
             small++;
         } else if (Character.isDigit(c)) {
             number++;
         } else {
             Special++;
         }
     }

     System.out.println("Caps count: " + caps);
     System.out.println("Small count: " + small);
     System.out.println("Number count: " + number);
     System.out.println("Special char count: " + Special);
 }
	

}
