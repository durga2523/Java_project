package org.set6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> employees = new LinkedHashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Employee Id: ");
            int empId = scanner.nextInt();

            // Clear the buffer
            scanner.nextLine(); // This consumes the newline character left by nextInt()

            System.out.print("Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Employee Phone No: ");
            long phone = scanner.nextLong();

            // Clear the buffer
            scanner.nextLine(); // This consumes the newline character left by nextLong()

            System.out.print("Employee Address: ");
            String address = scanner.nextLine();

            System.out.print("Employee DOB: ");
            String dob = scanner.nextLine();

            System.out.print("Employee DOJ: ");
            String doj = scanner.nextLine();

            System.out.print("Employee Email: ");
            String email = scanner.nextLine();

            System.out.print("Employee Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Employee Salary: ");
            float salary = scanner.nextFloat();

            // Clear the buffer
            scanner.nextLine(); // This consumes the newline character left by nextFloat()

            // Concatenate employee details into a single string and add to the set
            String employeeDetails = empId + "," + name + "," + phone + "," + address + "," + dob + "," + doj + "," + email + "," + gender + "," + salary;
            employees.add(employeeDetails);
        }

        scanner.close(); // Close the scanner to prevent resource leaks

        // Display all employees
//        System.out.println("\nEmployee details:");
//        for (String emp : employees) {
//            String[] details = emp.split(",");
//            System.out.println("Employee Id: " + details[0]);
//            System.out.println("Employee Name: " + details[1]);
//            System.out.println("Employee Phone No: " + details[2]);
//            System.out.println("Employee Address: " + details[3]);
//            System.out.println("Employee DOB: " + details[4]);
//            System.out.println("Employee DOJ: " + details[5]);
//            System.out.println("Employee Email: " + details[6]);
//            System.out.println("Employee Gender: " + details[7]);
//            System.out.println("Employee Salary: " + details[8]);
//            System.out.println();
//        }
    }
}
