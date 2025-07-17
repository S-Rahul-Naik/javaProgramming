import java.util.*;
public class JavaBasics {
    public static void main(String args[]){



// hello world program
        // System.out.print("hello world");
        // System.out.print("hello world\nhello world");



// // sum of two numbers
//         int a=10;
//         int b =5;
//         int sum = a+b;
//         System.out.println(sum);
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println("Sum of a and b is " + sum);





// boolean variable
        // Scanner sc= new Scanner(System.in) ;
        // Boolean input = sc.nextBoolean();
        // System.out.println(input);
        







// sum of two numbers using command line arguments
        // sum of two numbers using Scanner
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int  sum =a+b;
        // System.out.print(sum);






// product of two numbers using Scanner
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int  product =a*b;
        // System.out.print(product);









// area of a circle using Scanner
        // Scanner sc =new Scanner(System.in);
        // float rad =sc.nextFloat();
        // float area =3.14f*rad*rad;







//JavaFundamentalsDemo
        // System.out.print(area);
        // Scanner sc =new Scanner(System.in);
        // char ch = 'Z';
        // int num = ch;
        // System.out.print(num); //  90
        // int $ = 24;
        // System.out.print($); //24
        // System.out.println(2+2+"2"+2+2); //4222







// // JavaFundamentalsDemo
        // int left =5, right=10;
        // int mid = left +  right/2;
        // System.out.println(mid);;//10


        // System.out.println(17/2);//8
        // System.out.println(5-(10*15/2-(7+4))); //-59

        // System.out.println((5>0 || (0==10/0))); // true

        // System.out.println();








// swapping two numbers without using a third variable
        // int a = 10, b= 7;
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("a="+a);
        // System.out.println("b="+b);
        // System.out.println(2%3);
        // int age =16;
        // if(age>=18){
        //     System.out.println("drive and vote");
        // }
        // else{
        //     System.out.println("not adult");
        // }
        









// revrersing a number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // while(n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n/=10;












// reversing a number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int rev = 0;
        // while(n>0){
        //     int lastdigit = n%10;
        //     rev = (rev*10)+lastdigit;
        //     n/=10;
        // }
        //  System.out.print(rev);







// keep taking input until the user enters a number that is divisible by 10
        // Scanner sc =new Scanner(System.in);
        // do{
        //     System.out.print("Enter a number : ");
        //     int num = sc.nextInt();
        //     if(num %10 == 0){
        //         break;
        //     }
        //     System.out.println();
        // }while(true);












// display all the numbers entered by the user except the multiples of 10 
        // Scanner sc =new Scanner(System.in);
        // do{
        //     System.out.print("Enter a number : ");
        //     int num = sc.nextInt();
        //     if(num %10 == 0){
        //         continue;
        //     }
        //     System.out.println("number was : " + num);
        // }while(true);








// for loop example
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello");
        //     i += 2;                     // This will skip the increment of i by 1 in the next iteration
        // }









// check if a number is prime or not, brute force method
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean isPrime = true;
        // if(n==2){
        //     System.out.println("Prime");
        // }
        // else{
        //     for(int i=2; i*i<=n; i++){
        //     if(n%i==0){
        //         isPrime = false;
        //     }
        //     }
        //     if(isPrime==true){
        //         System.out.println("Prime");
        //     }
        //     else{
        //         System.out.println("Not Prime");
        //     }
        // }
        






// check if a number is prime or not, optimized method

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean isPrime = true;
        // if(n==2){
        //     System.out.println("Prime");
        // }
        // else{
        //     for(int i=2; i*i<=Math.sqrt(n); i++){
        //     if(n%i==0){
        //         isPrime = false;
        //     }
        //     }
        //     if(isPrime==true){
        //         System.out.println("Prime");
        //     }
        //     else{
        //         System.out.println("Not Prime");
        //     }
        // }




// sum of even and odd numbers entered by the user
                            // Scanner sc = new Scanner(System.in);

                            // int number;
                            // int choice;
                            // int evenSum = 0;
                            // int oddSum = 0;

                            // do {
                            //     System.out.print("Enter the number ");
                            //     number = sc.nextInt();

                            //     if (number % 2 == 0) {
                            //         evenSum += number;
                            //     } else {
                            //         oddSum += number;
                            //     }

                            //     System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
                            //     choice = sc.nextInt();

                            // } while (choice == 1);

                            // System.out.println("Sum of even numbers: " + evenSum);
                            // System.out.println("Sum of odd numbers: " + oddSum);

// {                                                   output:

//                             Enter the number 5
//                             Do you want to continue? Press 1 for yes or 0 for no: 1
//                             Enter the number 4
//                             Do you want to continue? Press 1 for yes or 0 for no: 1
//                             Enter the number 7
//                             Do you want to continue? Press 1 for yes or 0 for no: 0
//                             Sum of even numbers: 4
//                             Sum of odd numbers: 12
// }










// STAR// PATTERN

// {
//                     * 
//                     * *
//                     * * *
//                     * * * *
//                     * * * * *
// }


                        // int n = 5;
                        // for(int i=1; i<=n; i++){
                        //     for(int j=1; j<=i; j++){
                        //         System.out.print("* ");
                        //     }
                        //     System.out.println();
                        // }
                


        
// Inverted star PATTERN
// {
//                     * * * * *
//                     * * * *
//                     * * *
//                     * *
//                     *
// }
                    // int n = 5;
                    // for(int i=1; i<=n; i++){
                    //     for(int j=1; j<=n-i+1; j++){
                    //         System.out.print("* ");
                    //     }
                    //     System.out.println();
                    // }
            

// Number PATTERN
// {
//                     1
//                     1 2
//                     1 2 3
//                     1 2 3 4
//                     1 2 3 4 5
// }
                        // int n = 5;
                        // for(int i=1; i<=n; i++){
                        //     for(int j=1; j<=i; j++){
                        //         System.out.print(j + " ");
                        //     }
                        //     System.out.println();
                        // }





                




                        




































































































































































































































































































































































































































































































































































































































    }
}