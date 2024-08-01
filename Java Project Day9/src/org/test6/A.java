package org.test6;

public class A extends B {
	public A() {
		this(10);
		System.out.println("Default const...");
	}
	 public A(int id) {
	        super(id);
	    }
	public static void main(String[] args) {
		A a = new A();
	}
}
