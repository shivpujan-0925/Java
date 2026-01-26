// Do-while Loop:
// Syntax:

// do{

// }while(condition);

// Break Statment=> 
// to exit the Loop.

// Continue statemnet =>
// to skip iteration.

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
import java.util.*;

public class DoWhile {
       public static void main(String args[]) {

              // int counter =0;
              // do {
              // System.out.println("Hello World!");
              // counter++;
              // } while ( counter<=10);

              // Break Statemnet:

              // for(int i=1; i<=5; i++){
              // if(i==3){
              // break;
              // }
              // System.out.println(i);
              // }
              // System.out.println("I am out of the Loop");

              // problem-01:
              // Scanner sc = new Scanner(System.in);

              // do {
              // System.out.println("Enter your number");
              // int number = sc.nextInt() ;
              // if(number %10 == 0){
              // break;
              // }
              // System.out.println("Your given Value: "+number);
              // } while (true);
              // System.out.println("Your given number is multiple of 10X");

              // Continue Statement:
              // for(int i=0; i<=6; i++){
              // if(i == 3){
              // continue;
              // }

              // System.out.println(i);
              // }
              // System.out.println("Value 3 Skiped");

              // problem-2: Display all number except multiple of 10.

              // Scanner sc = new Scanner(System.in);
              // do {
              // System.out.println("Enter the number:");
              // int n = sc.nextInt();
              // if (n % 10 == 0) {
              // continue;
              // }
              // System.out.println("number was:" + n);

              // } while (true);

              // problem-03: check if number is prime or not:

              Scanner sc = new Scanner(System.in);
              int n = sc.nextInt();
              if (n == 2) {
                     System.out.println("Number is Prime");
              } else {
                     boolean isPrime = true;
                     // for (int i = 2; i <= n - 1; i++) {
                     //        if (n % i == 0) { // n is multiple of i(i is not 1 or i)
                     //               isPrime = false;
                     //        }
                     // }
                     // if (isPrime == true) {
                     //        System.out.print("Number is Prime");
                     // } else {
                     //        System.out.println("Number is Not Prime");
                     // }
                          
                     //Optimized:

                       for (int i = 2; i <= mathFunction.sqrt(n); i++) {
                            if (n % i == 0) { // n is multiple of i(i is not 1 or i)
                                   isPrime = false;
                            }
                     }
                     if (isPrime == true) {
                            System.out.print("Number is Prime");
                     } else {
                            System.out.println("Number is Not Prime");
                     }

              }

       }
}
