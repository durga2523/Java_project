package org.emp.day3;

public class Employee {
	private void empId(int Id, String name, long phoneno) {
		System.out.println(Id + "\n" + name + "\n" + phoneno);

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(12, "Durga", 9626020826l);
	}
}
