package org.college1;

public class Dept extends Hostel {
	public void deptName() {
		System.out.println("Department name is Information technology");
	}
	public static void main(String[] args) {
		Dept d=new Dept();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
		d.studentName();
		d.studentDept();
		d.studentId();
		d.hostelName();
		d.deptName();
	}
}
