//1.4)java.time.LocalDate class for age calculation
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their birthdate
        System.out.println("Enter your birthdate in the format (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the input into LocalDate
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Get the current date
        LocalDate today = LocalDate.now();

        // Calculate the period between birthdate and today's date
        Period age = Period.between(birthdate, today);

        // Print the calculated age in years, months, and days
        System.out.println("Your age is: ");
        System.out.println(age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
