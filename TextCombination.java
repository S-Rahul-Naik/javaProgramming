// Lesson 6: Combining Text and Variables

public class TextCombination {
    public static void main(String[] args) {
        
        // Variables
        String name = "Rahul";
        int age = 22;
        String company = "Google";
        double salary = 150000.0;
        
        // Different ways to combine text and variables
        
        // Method 1: Using + operator
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        
        // Method 2: Multiple combinations
        System.out.println("Hi! I'm " + name + " and I'm " + age + " years old");
        
        // Method 3: With calculations
        System.out.println("In 5 years, I'll be " + (age + 5) + " years old");
        
        // Method 4: Dream statement
        System.out.println("My goal: Work at " + company + " with $" + salary + " salary!");
        
        // Method 5: Multiple lines telling a story
        System.out.println("=== MY STORY ===");
        System.out.println("Name: " + name);
        System.out.println("Current Age: " + age);
        System.out.println("Dream Company: " + company);
        System.out.println("Target Salary: $" + salary);
        System.out.println("Years to achieve goal: " + (25 - age));
    }
}
