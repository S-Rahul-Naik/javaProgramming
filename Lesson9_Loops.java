// LESSON 9: LOOPS - Repeat code multiple times

public class Lesson9_Loops {
    public static void main(String[] args) {
        
        // FOR LOOP - when you know how many times
        System.out.println("=== FOR LOOP ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // WHILE LOOP - when you don't know how many times
        System.out.println("\n=== WHILE LOOP ===");
        int num = 1;
        while (num <= 3) {
            System.out.println("Number: " + num);
            num++;
        }
        
        // PRACTICAL EXAMPLE: Print your name 10 times
        System.out.println("\n=== PRACTICE ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Future Google Employee");
        }
    }
}

/*
SYNTAX:
for (start; condition; increment) { code }
while (condition) { code }
*/
