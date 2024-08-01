package org.emp;

import org.client.Client;
import org.company1.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Employee Name is Durga");

	}
public static void main(String[] args) {
	Employee e= new Employee();
	Company c=new Company();
	Client d=new Client();
	Project p =new Project();
	e.empName();
	c.companyName();
	d.clientName();
	p.projectName();
			
}
}
