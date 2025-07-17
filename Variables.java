// Lesson 4: Variables - Your Data Storage Boxes

public class Variables {
    public static void main(String[] args) {
        
        // INTEGER BOX - stores whole numbers
        int age = 22;
        int score = 95;
        
        // STRING BOX - stores text/words
        String name = "Rahul";
        String city = "Bangalore";
        
        // DOUBLE BOX - stores decimal numbers
        double salary = 75000.50;
        double height = 5.9;
        
        // BOOLEAN BOX - stores true/false
        boolean isEmployed = false;
        boolean wantsGoogleJob = true;
        
        // Let's see what's in our boxes
        System.out.println("=== MY INFORMATION ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("City: " + city);
        System.out.println("Height: " + height + " feet");
        System.out.println("Current Salary: $" + salary);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Wants Google Job: " + wantsGoogleJob);
        System.out.println("Test Score: " + score);
    }
}
