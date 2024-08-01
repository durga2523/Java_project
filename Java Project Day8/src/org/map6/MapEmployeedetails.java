package org.map6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEmployeedetails {
	public static void main(String[] args) {
		Map<Integer, Map<String, Object>> employees = new LinkedHashMap<>();

        // Adding 15 employees to the map
        employees.put(1, createEmployee("John Doe", "123-456-7890", "123 Main St, Anytown, USA", "1985-01-01", "2010-06-15", "john.doe@example.com", "Male", 60000));
        employees.put(2, createEmployee("Jane Smith", "987-654-3210", "456 Elm St, Othertown, USA", "1990-02-14", "2012-08-01", "jane.smith@example.com", "Female", 65000));
        employees.put(3, createEmployee("Alice Johnson", "555-123-4567", "789 Oak St, Anothertown, USA", "1988-03-12", "2015-09-23", "alice.johnson@example.com", "Female", 70000));
        employees.put(4, createEmployee("Bob Brown", "444-555-6666", "321 Pine St, Anytown, USA", "1975-04-05", "2005-07-10", "bob.brown@example.com", "Male", 75000));
        employees.put(5, createEmployee("Carol White", "333-444-5555", "654 Maple St, Othertown, USA", "1992-05-15", "2018-10-01", "carol.white@example.com", "Female", 62000));
        employees.put(6, createEmployee("David Green", "222-333-4444", "987 Cedar St, Thistown, USA", "1982-06-20", "2011-11-11", "david.green@example.com", "Male", 67000));
        employees.put(7, createEmployee("Eva Black", "111-222-3333", "123 Birch St, Thatown, USA", "1995-07-30", "2019-12-05", "eva.black@example.com", "Female", 64000));
        employees.put(8, createEmployee("Frank Gray", "999-888-7777", "456 Aspen St, Anothertown, USA", "1980-08-25", "2008-01-20", "frank.gray@example.com", "Male", 80000));
        employees.put(9, createEmployee("Grace Blue", "888-777-6666", "789 Willow St, Othertown, USA", "1987-09-15", "2013-02-14", "grace.blue@example.com", "Female", 68000));
        employees.put(10, createEmployee("Henry Purple", "777-666-5555", "321 Cherry St, Anytown, USA", "1993-10-05", "2016-03-21", "henry.purple@example.com", "Male", 71000));
        employees.put(11, createEmployee("Ivy Red", "666-555-4444", "654 Walnut St, Thatown, USA", "1989-11-11", "2014-04-25", "ivy.red@example.com", "Female", 69000));
        employees.put(12, createEmployee("Jack Orange", "555-444-3333", "987 Poplar St, Thistown, USA", "1986-12-20", "2009-05-30", "jack.orange@example.com", "Male", 76000));
        employees.put(13, createEmployee("Kathy Yellow", "444-333-2222", "123 Fir St, Anothertown, USA", "1991-01-22", "2017-06-10", "kathy.yellow@example.com", "Female", 63000));
        employees.put(14, createEmployee("Liam Cyan", "333-222-1111", "456 Hemlock St, Othertown, USA", "1994-02-28", "2020-07-19", "liam.cyan@example.com", "Male", 66000));
        employees.put(15, createEmployee("Mia Magenta", "222-111-0000", "789 Spruce St, Thistown, USA", "1996-03-15", "2021-08-22", "mia.magenta@example.com", "Female", 65000));

        // Print the employee details
        for (Map.Entry<Integer, Map<String, Object>> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey());
            System.out.println("Details: " + entry.getValue());
            System.out.println();
        }
    }

    private static Map<String, Object> createEmployee(String name, String phone, String address, String dob, String doj, String email, String gender, int salary) {
        Map<String, Object> employee = new LinkedHashMap<>();
        employee.put("Name", name);
        employee.put("Phone", phone);
        employee.put("Address", address);
        employee.put("Dob", dob);
        employee.put("Doj", doj);
        employee.put("Email", email);
        employee.put("Gender", gender);
        employee.put("Salary", salary);
        return employee;

		}
			
		}
	

       

