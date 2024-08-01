package org.scanner;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting student details
        System.out.print("Enter student registration number: ");
        String studentRegNo = scanner.nextLine();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter mark 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = scanner.nextInt();

        System.out.print("Enter mark 4: ");
        int mark4 = scanner.nextInt();

        System.out.print("Enter mark 5: ");
        int mark5 = scanner.nextInt();

        // Calculating total and average
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;

        // Displaying the results
        System.out.println("Student Registration Number: " + studentRegNo);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

    }
}


