/*
==========================================================================
                        LESSON 6 - EXERCISE 1
==========================================================================

EXERCISE: Personal Calculator

TASK: Create a program that calculates and displays age-related information

REQUIREMENTS:
1. Store your current age in a variable
2. Calculate and print:
   - How old you'll be in 10 years
   - How old you were 5 years ago  
   - How many years until you're 30
   - How many months you've been alive

EXAMPLE OUTPUT:
Current Age: 22
In 10 years: 32
5 years ago: 17
Years until 30: 8
Months alive: 264

==========================================================================
*/

public class Lesson6_Exercise1 {
    public static void main(String[] args) {
        
        // TODO: Replace ?? with your actual age
        int currentAge = 22;
        
        // TODO: Calculate future age (current + 10)
        int futureAge = (currentAge+10);
        
        // TODO: Calculate past age (current - 5)
        int pastAge = (currentAge-5);
        
        // TODO: Calculate years until 30 (30 - current)
        int yearsUntil30 = (30-currentAge);
        
        // TODO: Calculate months alive (current age * 12)
        int monthsAlive = (currentAge*12);

        // Add more print statements here1
        // TODO: Print all the results
        
        System.out.println("=== PERSONAL AGE CALCULATOR ===");
        System.out.println("Current Age: " + currentAge);
        System.out.println("futureAge:" + futureAge);
        System.out.println("pastAge: " + pastAge);
        System.out.println("yearsUntil30: "+ yearsUntil30);
        System.out.println("monthsAlivr:" +monthsAlive);
        
        
        
        
        
        
    }
}

/*
==========================================================================
INSTRUCTIONS:
1. Replace all ?? with correct calculations
2. Complete the print statements
3. Run the program and check your output
4. Once working, show your code for review!

HINT: Use parentheses for calculations: (currentAge + 10)
==========================================================================
*/
