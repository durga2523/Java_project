package org.uni.day3;

public class College extends University {
	public void ug() {
		System.out.println("College -UG");

	}
	public void pg() {
		System.out.println("College -PG");

	}
	public static void main(String[] args) {
		College c=new College();
		c.ug();
		c.pg();
	}
}
