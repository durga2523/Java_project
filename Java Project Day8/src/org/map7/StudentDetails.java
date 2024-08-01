package org.map7;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentDetails {
    public static void main(String[] args) {
        // Define a HashMap to store student details
        Map<Integer, Map<String, Object>> students = new LinkedHashMap<>();

        // Adding 15 students to the map
        students.put(1, createStudent("Alice Brown", "555-123-4567", "123 Main St, Anytown, USA", "2000-01-01", "alice.brown@example.com", "Female"));
        students.put(2, createStudent("Bob Smith", "555-987-6543", "456 Elm St, Othertown, USA", "2001-02-14", "bob.smith@example.com", "Male"));
        students.put(3, createStudent("Charlie Johnson", "555-234-5678", "789 Oak St, Anothertown, USA", "1999-03-12", "charlie.johnson@example.com", "Male"));
        students.put(4, createStudent("David Wilson", "555-345-6789", "321 Pine St, Thistown, USA", "2002-04-05", "david.wilson@example.com", "Male"));
        students.put(5, createStudent("Eva White", "555-456-7890", "654 Maple St, Thatown, USA", "2000-05-15", "eva.white@example.com", "Female"));
        students.put(6, createStudent("Fiona Green", "555-567-8901", "987 Cedar St, Sometown, USA", "2001-06-20", "fiona.green@example.com", "Female"));
        students.put(7, createStudent("George Black", "555-678-9012", "123 Birch St, Heretown, USA", "1999-07-30", "george.black@example.com", "Male"));
        students.put(8, createStudent("Hannah Blue", "555-789-0123", "456 Aspen St, Ourtown, USA", "2000-08-25", "hannah.blue@example.com", "Female"));
        students.put(9, createStudent("Ian Gray", "555-890-1234", "789 Willow St, Yourtown, USA", "2002-09-15", "ian.gray@example.com", "Male"));
        students.put(10, createStudent("Jack Brown", "555-901-2345", "321 Cherry St, Theirtown, USA", "1999-10-05", "jack.brown@example.com", "Male"));
        students.put(11, createStudent("Kara Red", "555-012-3456", "654 Walnut St, Anycity, USA", "2001-11-11", "kara.red@example.com", "Female"));
        students.put(12, createStudent("Leo Orange", "555-123-4560", "987 Poplar St, Somecity, USA", "2000-12-20", "leo.orange@example.com", "Male"));
        students.put(13, createStudent("Mia Yellow", "555-234-5671", "123 Fir St, Othercity, USA", "2001-01-22", "mia.yellow@example.com", "Female"));
        students.put(14, createStudent("Nina Cyan", "555-345-6782", "456 Hemlock St, Thiscity, USA", "2002-02-28", "nina.cyan@example.com", "Female"));
        students.put(15, createStudent("Oscar Magenta", "555-456-7893", "789 Spruce St, Thatcity, USA", "2000-03-15", "oscar.magenta@example.com", "Male"));

        // Print the student details
        for (Map.Entry<Integer, Map<String, Object>> entry : students.entrySet()) {
            System.out.println("Student ID: " + entry.getKey());
            System.out.println("Details: " + entry.getValue());
            System.out.println();
        }
    }

    private static Map<String, Object> createStudent(String name, String phone, String address, String dob, String email, String gender) {
        Map<String, Object> student = new LinkedHashMap<>();
        student.put("stdName", name);
        student.put("stdPhone", phone);
        student.put("address", address);
        student.put("dOB", dob);
        student.put("eMail", email);
        student.put("gender", gender);
        return student;
    }
}
