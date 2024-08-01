package com.task3;

import com.tns.dayone.FirstProgram;

//child class
public class Herachical_Inheritance extends SingleInheritance{
private void schoolId() {
	System.out.println("School ID 328782");

}
private void schoolName() {
	System.out.println("School Name OMHSS");
}
 static public void main(String[] args) {
	Herachical_Inheritance b=new Herachical_Inheritance();
	FirstProgram d=new FirstProgram();
	b.schoolId();
	b.schoolName();
	b.employeId();
	b.employeeAddress();
	d.durgaId();
	d.durgaDegree();
}
}
