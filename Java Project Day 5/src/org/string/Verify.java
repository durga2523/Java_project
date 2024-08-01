package org.string;

public class Verify {
	public static void main(String[] args) {
		String s1 = " software643@gmail.com";
//	contains
		boolean contains1 = s1.contains("@");
//	System.out.println(contains);
		if (contains1) {
			System.out.println("valid email id");
		} else {
			System.out.println("invalid email id");
		}
		String s2 = "3-53-2m,Balamurugan,Thanjavur";
		boolean contains2 = s2.contains("pincode");
		if (contains2) {
			System.out.println("valid address");

		} else {
			System.out.println("invalid value");
		}
		String s3 = "automation24@gmail.com";
		boolean contains3 = s3.contains("@");
		if (contains2) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

		String s4 = " 9a654e2i0";
		boolean contains4 = s4.contains("c");
		if (contains4) {
			System.out.println("true");

		} else {
			System.out.println("invalid");
		}

	}
}
