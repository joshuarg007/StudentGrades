import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Grades {  // Declare the Grades class

    public static void main(String[] args) {  // Main method start

        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);  // Create a new Scanner object for user input

        List<Student> studentList = new LinkedList<>();  // Create a new LinkedList to store Student objects

        System.out.println("Enter student data (name, address, GPA) or type 'exit' to finish:");  // Print a prompt for user input

        while (true) {  // Start an infinite loop for user input
            System.out.print("Name: ");  // Prompt for student name
            String studentName = myScanner.nextLine();  // Read student name from user input

            if (studentName.equalsIgnoreCase("exit")) {  // Check if user entered 'exit'
                break;  // Exit the loop if 'exit' is entered
            }  // END if

            System.out.print("Address: ");  // Prompt for student address
            String studentAddress = myScanner.nextLine();  // Read student address from user input

            double GPA;  // Declare GPA variable

            while (true) {  // Start an inner loop for GPA validation
                System.out.print("GPA: ");  // Prompt for GPA

                try {  // Try block to catch NumberFormatException
                    GPA = Double.parseDouble(myScanner.nextLine());  // Read and parse GPA from user input

                    if (GPA >= 0 && GPA <= 4.0) {  // Check if GPA is between 0 and 4
                        break;  // Exit the inner loop if GPA is valid
                    } else {
                        System.out.println("Invalid GPA. Please enter a number between 0 and 4.");  // Print error message for invalid GPA
                    }
                } catch (NumberFormatException e) {  // Catch NumberFormatException
                    System.out.println("Invalid input. Please enter a valid number.");  // Print error message for invalid number format
                }
            }  // END inner while

            studentList.add(new Student(studentName, studentAddress, GPA));  // Create a new Student object and add it to the studentList
        }  // END outer while

        // Sort the student list by name in ascending order
        Collections.sort(studentList, (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));

        // Write the student data to a text file
        try (FileWriter writer = new FileWriter("StudentData.txt")) {  // Create a FileWriter object for writing to a file
            for (Student student : studentList) {  // Loop through each Student object in the studentList
                writer.write("Name: " + student.getName() + "\n");  // Write student name to file
                writer.write("Address: " + student.getAddress() + "\n");  // Write student address to file
                writer.write("GPA: " + student.getGPA() + "\n");  // Write student GPA to file
                writer.write("-----------------------\n");  // Write separator to file
            }
            System.out.println("Student data written to StudentData.txt");  // Print success message
        } catch (IOException e) {  // Catch IOException
            System.out.println("An error occurred while writing to the file.");  // Print error message for file writing
            e.printStackTrace();  // Print stack trace for debugging
        }
    }  // END main method
}  // END Grades class
