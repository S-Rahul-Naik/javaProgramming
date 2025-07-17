// Lesson 1: Variables and Data Types
// This is your first step towards Google!

public class JavaBasics_Lesson1 {
    public static void main(String[] args) {
        
        // 1. INTEGER - whole numbers
        int age = 25;
        int salary = 50000;
        
        // 2. STRING - text/words
        String name = "Future Google Engineer";
        String company = "Google";
        
        // 3. DOUBLE - decimal numbers
        double height = 5.8;
        double gpa = 8.5;
        
        // 4. BOOLEAN - true/false
        boolean isStudent = true;
        boolean hasJob = false;
        
        // Let's print everything
        System.out.println("=== MY PROFILE ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("GPA: " + gpa);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Has Job: " + hasJob);
        System.out.println("Dream Company: " + company);
        System.out.println("Expected Salary: $" + salary);
        
        // Your goal
        System.out.println("\n🎯 GOAL: Get placed in " + company + "!");
    }
}
