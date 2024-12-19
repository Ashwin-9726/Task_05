//1.3)List interface, lambda expression and stream API
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Student_List {
    public static void main(String[] args) {
        // Create a list of 10 students' names
        List<String> students = Arrays.asList("Ashwin", "Venkat", "Ram", "Aravind", "Sukanya",
                "Anto", "Dhanapriya", "Aparna", "Gukesh", "Arjuna");

        // Use Stream API and lambda expressions to filter names starting with "A"
        List<String> studentsWithNameStartingWithA = students.stream()
                .filter(name -> name.startsWith("A")) // Filter students whose names start with "A"
                .collect(Collectors.toList()); // Collect results into a list

        // Print the list of students whose names start with "A"
        System.out.println("Students whose names start with 'A': " + studentsWithNameStartingWithA);
    }
}