package org.polymorphism;

//method overloading
public class Sample {
	private void employee() {
		System.out.println("EMPLOYEE STATUS");
	}

	private void employee(int Id) {
		System.out.println(Id);
	}

//based on datatypes
	private void employee(String name) {
		System.out.println(name);
	}

	private void employee(int age, String email, char gender) {
		System.out.println(age + "\n" + email + "\n" + gender); // based on datatype count
	}

	private void employee(long phoneNo, float salary) {
		System.out.println(phoneNo + "\n" + salary);
	}

//based on datatype order
	private void employee(float avgSalary, long officeId) {
		System.out.println(avgSalary + "\n" + officeId);
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.employee();
		s.employee(12);
		s.employee("Durga");
		s.employee(21, "durgadevi96260@gmail.com", 'W');
		s.employee(9626020826l, 50.899f);
		s.employee(30.977f, 311821205012l);
	}

}
