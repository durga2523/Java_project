package org.string;

public class Character1 {
	public static void main(String[] args) {
		String s1 = "SoftwareTestEngineer";
		String s2 = "SeleniumAutomationtool";
		String s3 = "Goodmorning";
		String s4 = "j a v a p r o g r a m";
		String s5 = "9876543210";
//	charAt
		int indexOf1 = s1.indexOf('e');
		char charAt1 = s1.charAt(indexOf1);
		System.out.println("SoftwareTestEngineer : " + charAt1);
		int indexOf2 = s2.indexOf('o');
		char charAt2 = s2.charAt(indexOf2);
		System.out.println("SeleniumAutomationtool : " + charAt2);
		int indexOf3 = s3.indexOf('o');
		char charAt3 = s3.charAt(indexOf3);
		System.out.println("Goodmorning : " + charAt3);
		int indexOf4 = s4.indexOf('p');
		char charAt4 = s4.charAt(indexOf4);
		System.out.println("j a v a p r o g r a m : " + charAt4);
		int indexOf5 = s5.indexOf('7');
		char charAt5 = s5.charAt(indexOf5);
		System.out.println("9876543210 : " + charAt5);
	}

	
}
