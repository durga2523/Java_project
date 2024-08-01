package org.string;

public class StartsWith {
	public static void main(String[] args) {
		String w = "Welcome to class java";
		String s = "Selenium tool";
		String w1 = "Welcome to java class";
		String w2 = "Welcome to java class";
		String w3 = "Welcome to java class";
		String w4 = " ";
//	Startswith
		boolean startsWith = w.startsWith("Welcome");
		System.out.println(w);
		System.out.println("inWelcome : " + startsWith);
		boolean startsWith1 = s.startsWith("Welcome");
		System.out.println(s);
		System.out.println("inWelcome : " + startsWith1);

		boolean endsWith = w1.endsWith("class");
		System.out.println(w1);
		System.out.println("inclass : " + endsWith);
		boolean endsWith1 = w2.endsWith("java");
		System.out.println("injava : " + w2);
		System.out.println(endsWith1);
//empty or not
		boolean empty = w3.isEmpty();
		System.out.println(w3);
		System.out.println("isEmpty  : " + empty);
		boolean empty2 = w4.isEmpty();
		System.out.println(" " + w4);
		System.out.println("isEmpty :  " + empty2);

	}
}
