package org.string;

public class Hashcode {
	public static void main(String[] args) {
//	Literal string
		System.out.println("question1");
		String j1 = "JAVA";
		System.out.println(j1);
		System.out.println(System.identityHashCode(j1));
		String j2 = "JAVA";
		System.out.println(j2);
		System.out.println(System.identityHashCode(j2));
//	non Literal string
		System.out.println("question2");
		String s1 = new String("selenium");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

		String s2 = new String("selenium");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));

		System.out.println("question3");
		String a1 = new String("java");
		System.out.println(a1);
		System.out.println(System.identityHashCode(a1));
		String a2 = new String("program");
		System.out.println(a2);
		System.out.println(System.identityHashCode(a2));
		String a3 = new String("javaprogram");
		System.out.println(a3);
		System.out.println(System.identityHashCode(a3));
		System.out.println("question4");
//	literal string
		String b1 = "java";
		System.out.println(b1);
		System.out.println(System.identityHashCode(b1));
		String b2 = "program";
		System.out.println(b2);
		System.out.println(System.identityHashCode(b2));
		String b3 = "javaprogram";
		System.out.println(b3);
		System.out.println(System.identityHashCode(b3));

	}
}
