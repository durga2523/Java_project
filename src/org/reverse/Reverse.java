package org.reverse;

public class Reverse {
public static void main(String[] args) {
	String s="PYTHON";
	String rev=" ";
	for (int i = s.length()-1; i >=0; i--) {
		char c = s.charAt(i);
		String rev1= rev+c;
		System.out.print(rev1);
	}
	System.out.println();
}
}
