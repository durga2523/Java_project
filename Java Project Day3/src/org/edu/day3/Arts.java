package org.edu.day3;

public class Arts extends Education {
	public void bsc() {
		System.out.println("BSC");
	}
	public void bEd() {
		System.out.println("BED");
	}
	public void bA() {
		System.out.println("BA");
	}
	public void bBA() {
		System.out.println("BBA");
	}
	public void ug() {
		System.out.println("UG");
	}
	public void pg() {
		System.out.println("PG");
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.ug();
		a.pg();
		a.bsc();
		a.bA();
		a.bEd();
		a.bBA();
	}
}
