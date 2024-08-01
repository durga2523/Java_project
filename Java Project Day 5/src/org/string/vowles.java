package org.string;

public class vowles {
public static void main(String[] args) {
	String r="Welcome";
	String output = r.replaceAll("[aeiouAEIOU]", "@");

	System.out.println("Input: " + r);
	System.out.println("Output: " + output);
	}
}






//	StringBuilder output = new StringBuilder();
//
//   for (int i = 0; i < r.length(); i++) {
//        char c = r.charAt(i);
//
//        if (isVowel(c)) {
//            output.append('@');
//        } else {
//            output.append(c);
//        }
//    }
//
//    System.out.println("Input: " + r);
//    System.out.println("Output: " + output.toString());
//}
//
//public static boolean isVowel(char c) {
//    char lowerCaseC = Character.toLowerCase(c);
//    return lowerCaseC == 'a' || lowerCaseC == 'e' || lowerCaseC == 'i' || lowerCaseC == 'o' || lowerCaseC == 'u';
//}


