import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // Define the file name and path
        String fileName = "example.txt";

        // Define the lines of text to be written to the file
        String[] lines = {
            "This is line 1.",
            "This is line 2.",
            "This is line 3.",
            "This is line 4.",
            "This is line 5.",
            "This is line 6.",
            "This is line 7.",
            "This is line 8.",
            "This is line 9.",
            "This is line 10."
        };

        // Use try-with-resources to ensure the BufferedWriter is closed properly
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine(); // Add a new line after each line of text
            }
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








































//public class Question12 {
//	
//	    public static void main(String[] args) {
//	        int number = 123; // Change this to any number
//	        
//	        int count = 0;
//	        int temp = number;
//
//	        while (temp != 0) {
//	            count++;
//	            temp /= 10;
//	        }
//
//	        System.out.println("Count of the number: " + count);
//	    }
//	}
//

