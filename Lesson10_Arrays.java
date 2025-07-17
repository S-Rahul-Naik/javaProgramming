// LESSON 10: ARRAYS - Store multiple values

public class Lesson10_Arrays {
    public static void main(String[] args) {
        
        // Creating arrays
        int[] numbers = {10, 20, 30, 40, 50};
        String[] companies = {"Google", "Microsoft", "Amazon", "Apple"};
        
        // Accessing elements (starts from 0)
        System.out.println("First number: " + numbers[0]);
        System.out.println("Dream company: " + companies[0]);
        
        // Array length
        System.out.println("Array size: " + numbers.length);
        
        // Loop through array
        System.out.println("\n=== ALL NUMBERS ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        System.out.println("\n=== TECH COMPANIES ===");
        for (int i = 0; i < companies.length; i++) {
            System.out.println((i+1) + ". " + companies[i]);
        }
    }
}

/*
SYNTAX:
dataType[] name = {value1, value2, value3};
arrayName[index] = access element
arrayName.length = get size
*/
