package org.string;

public class Index {
public static void main(String[] args) {
	String s1="welcometojava";
	String s2="SeleniumAutomationtool";
	String s3="theatre";
	String s4="j a v a p r o g r a m";
	String s5="9876543210";
//	indexOf
	int indexOf1 = s1.lastIndexOf("et");
	System.out.println("welcometojava : "+indexOf1);
	int indexOf2 =s2.indexOf("m");
	System.out.println("SeleniumAutomationtool : "+indexOf2);
	int indexOf3=s3.indexOf("t");
	System.out.println("theatre : "+indexOf3);
	int indexOf4=s4.lastIndexOf(" ");
	System.out.println("j a v a p r o g r a m : "+indexOf4);
	int indexOf5=s5.indexOf("8");
	System.out.println("9876543210 : "+indexOf5);
}
}
