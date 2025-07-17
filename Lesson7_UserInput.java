/*
==========================================================================
                        LESSON 7 - USER INPUT
==========================================================================

TOPIC: Getting Input from User (Scanner)

CONCEPT: So far we've only printed output. Now let's learn to take input!

KEY LEARNING:
- Scanner class: To read user input
- nextInt(): For numbers
- nextLine(): For text
- Import statement: Required for Scanner

EXAMPLE:
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();

==========================================================================
*/

import java.util.Scanner;

public class Lesson7_UserInput {
    public static void main(String[] args) {
        
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Example 1: Getting name
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        // Example 2: Getting age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        // Example 3: Getting salary expectation
        System.out.print("Enter expected salary: ");
        double salary = input.nextDouble();
        
        // Display the information
        System.out.println("\n=== YOUR PROFILE ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Expected Salary: $" + salary);
        System.out.println("In 5 years you'll be: " + (age + 5));
        
        // Close scanner (good practice)
        input.close();
    }
}

/*
==========================================================================
NEXT EXERCISE: Create an interactive program that:
1. Asks user for their name, age, and city
2. Calculates their birth year (2025 - age)
3. Tells them when they'll be 65 (retirement age)
4. Shows a personalized message
==========================================================================
*/
