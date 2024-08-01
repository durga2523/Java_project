package org.edu;

public class Medicine extends Engineering{
	public void physiyo() {
		System.out.println("Physiyo");
	}
	public void dental() {
		System.out.println("Dental");
	}
	public void mbbs() {
		System.out.println("MBBS");
	}
	public static void main(String[] args) {
		Medicine m= new Medicine();
		m.ug();
		m.pg();
		m.bsc();
		m.bed();
		m.ba();
		m.bba();
		m.be();
		m.btech();
		m.physiyo();
		m.dental();
		m.mbbs();
	}
}
