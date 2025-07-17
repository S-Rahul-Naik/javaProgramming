/*
==========================================================================
                        LESSON 8 - IF-ELSE STATEMENTS
==========================================================================

TOPIC: Making Decisions in Code

CONCEPT: Sometimes your program needs to make choices based on conditions

SYNTAX:
if (condition) {
    // Do this if condition is true
} else {
    // Do this if condition is false
}

COMPARISON OPERATORS:
== (equal to)
!= (not equal to)  
> (greater than)
< (less than)
>= (greater than or equal)
<= (less than or equal)

==========================================================================
*/

import java.util.Scanner;

public class Lesson8_IfElse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Example 1: Age-based decisions
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        if (age >= 18) {
            System.out.println("You are an adult!");
            System.out.println("You can vote!");
        } else {
            System.out.println("You are a minor.");
            System.out.println("Wait " + (18 - age) + " more years to vote.");
        }
        
        // Example 2: Google eligibility check
        System.out.print("Enter your programming experience (years): ");
        int experience = input.nextInt();
        
        if (experience >= 2) {
            System.out.println("🎉 You might be eligible for Google!");
            System.out.println("Start applying to tech companies!");
        } else {
            System.out.println("Keep learning! You need " + (2 - experience) + " more years.");
            System.out.println("Practice coding daily!");
        }
        
        // Example 3: Salary expectations
        System.out.print("Enter expected salary: ");
        double expectedSalary = input.nextDouble();
        
        if (expectedSalary >= 100000) {
            System.out.println("High expectations! Work hard for it!");
        } else {
            System.out.println("Good starting point!");
        }
        
        // Example 4: Multiple conditions
        if (age >= 18 && experience >= 1) {
            System.out.println("✅ Perfect! You can start job hunting!");
        } else {
            System.out.println("❌ Not ready yet. Keep preparing!");
        }
        
        input.close();
    }
}

/*
==========================================================================
NEW OPERATORS YOU LEARNED:
&& = AND (both conditions must be true)
|| = OR (at least one condition must be true)
!  = NOT (opposite of the condition)

NEXT EXERCISE: Create a program that checks if someone can get a Google job
based on age, experience, and education level!
==========================================================================
*/
