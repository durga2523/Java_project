package org.string;

public class Case {
	public static void main(String[] args) {
		
	
	String s = "Selenium";

	String j = "javaprogram";

//	Lowercase
	String lowerCase = s.toLowerCase();
	System.out.println("Selenium : "+lowerCase);
	
	
//	uppercase
	String upperCase = j.toUpperCase();
	System.out.println("javaprogram : "+upperCase);
	
	
	
//	 all small letter and into capital letter
 
	String w = "WelcomE";
	StringBuffer newStr=new StringBuffer();  
	for (int i = 0; i < w.length(); i++) {
        char c = w.charAt(i);
        if (Character.isUpperCase(c)) {
            newStr.append(Character.toLowerCase(c)); // Convert uppercase to lowercase and append
        } else if (Character.isLowerCase(c)) {
            newStr.append(Character.toUpperCase(c)); // Convert lowercase to uppercase and append
        }
	 else {
        newStr.append(c); // Append characters that are not alphabetic
    }
    }
    System.out.println("WelcomE : "+newStr); 
        
	
	
	
//	the number of uppercase count and lowercase count inthe given String
	
	String r = "WelComeToJava";
	int uppercaseCount = 0;
    int lowercaseCount = 0;

    for (int i = 0; i < r.length(); i++) {
        char d = r.charAt(i);
        if (Character.isUpperCase(d)) {
            uppercaseCount++;
        } else if (Character.isLowerCase(d)) {
            lowercaseCount++;
        }
    }

    System.out.println("Uppercase count of WelComeToJava : " + uppercaseCount);
    System.out.println("Lowercase count of WelComeToJava: " + lowercaseCount);
}
	}
	

	

