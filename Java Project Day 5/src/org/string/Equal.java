package org.string;

public class Equal {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String t1 = "Java";
		String t2 = "java";

		String r1 = "Social media";
		String r2 = "SocialMedia";

		String i1 = "Java";
		String i2 = "java";
		String n1 = "SeleniumTool";
		String n2 = "seleniumtool";
//	  equal or not
		boolean equals1 = s1.equals(s2);
		System.out.println("Java = Java : " + equals1);
		boolean equals2 = t1.equals(t2);
		System.out.println("Java = java : " + equals2);
		boolean equals3 = r1.equals(r2);
		System.out.println("Social media = Social media : " + equals3);
		boolean equals4 = i1.equalsIgnoreCase(i2);
		System.out.println("Java = java : " + equals4);
		boolean equals5 = n1.equalsIgnoreCase(n2);
		System.out.println("SeleniumTool = seleniumTool : " + equals5);

	}
}
