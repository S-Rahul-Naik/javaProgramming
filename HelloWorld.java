// Lesson 3: Your First Program
// Every programmer writes this first!

public class HelloWorld {
//     public static void main(String[] args) {
//         // This prints text on the screen
//         System.out.println("Hello World!");
//         System.out.println("I am learning Java!");
//         System.out.println("My goal is to work at Google!");
//     }
        public static int score(int arr[]){
            // For maximum score, we need to arrange the array in ascending order
            // Then calculate sum of arr[i] * (i+1) for all elements
            java.util.Arrays.sort(arr); // Sort in ascending order
            int score = 0;
            for(int i = 0; i < arr.length; i++){
                score += arr[i] * (i + 1);
            }
            return score;
        }
        public static void main(String args[]){
            int arr[] = {1,2,3,4,5};
            System.out.println(score(arr));
            
        }
}
