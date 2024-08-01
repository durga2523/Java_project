package org.exception4;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			int data = 5 / 0;
		} catch (ArithmeticException e) {
			Throwable obj = new Throwable("sample");
			try {
				throw obj;
			} catch (Throwable el) {
				System.out.println("8");
			}
		} finally {
			System.out.println("3");
		}
		System.out.println("4");
	}
}
