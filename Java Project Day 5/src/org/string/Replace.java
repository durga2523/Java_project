package org.string;

public class Replace {
	public static void main(String[] args) {
		String w = "Welcome to class java";
		String s = "Software Testing";
		String w2 = "Welcome to java class";
		String t = "Testingtool24@gmail.com";
		String r = "3-53-2m,Balamurugan,Thanjavur,pincode-613001";
//Replace
		String replaceAll = w.replaceAll("java", "python");
		System.out.println(replaceAll);
		String replaceAll1 = s.replaceAll("Software", "Automation");
		System.out.println(replaceAll1);
		String replaceAll2 = w2.replaceAll(" ", "#");
		System.out.println(replaceAll2);
		String replaceAll3 = t.replaceAll("gmail", "yahoo");
		System.out.println(replaceAll3);
		String replaceAll4 = r.replaceAll(",pincode-613001", " ");
		System.out.println(replaceAll4);
	}
}
