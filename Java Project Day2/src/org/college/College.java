package org.college;

public class College {
	private void collegeName() {
		System.out.println("College name is MSAJCE");

	}
	private void collegeCode() {
		System.out.println("Colege Code is 3118");

	}
	private void collegeRank() {
		// TODO Auto-generated method stub
System.out.println("College Rank is 31 ");
	
	
	}
	public static void main(String[] args) {
		College c=new College();
		Student s=new Student();
		Hostel h= new Hostel();
		Dept d= new Dept();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		s.studentName();
		s.studentDept();
		s.studentId();
		h.hostelName();
		d.deptName();
	}

}
