package org.setencap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Employee extends ExcapSet{
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setName("John Doe");
    e1.setAge(30);
    e1.setPhoneno(1234567890L);
    Employee e2=new Employee();
	e2.setName("John ");
    e2.setAge(35);
    e2.setPhoneno(12345678877890L);
    Employee e3=new Employee();
	e3.setName("Doe");
    e3.setAge(25);
    e3.setPhoneno(12345678997970L);
    Set<Employee>s=new LinkedHashSet<>();
       s.add(e1);
       s.add(e2);
       s.add(e3);
       for (Employee employee : s) {
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getPhoneno());
	}
    // Get and print values
    
}
}
