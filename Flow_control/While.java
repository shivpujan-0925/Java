import java.util.*;


// #while loop:

// Syntax;

// while(condition){


// }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

public class While{
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //    int counter = 0;
        //    while (counter <=10 ) {
        //       System.out.println("Hello world!");
        //       counter++;
        //    }

      //Print 1 to 100

      // int number = 1;
      // while (number <= 100) {
      //   System.out.print(number+ " ");
      //   number++;
        
      // }
      // System.out.println();

    // Print from 1 to N:
    
    // System.out.println("Enter Number:");  
    // int n = sc.nextInt();
    // int counter = 1;
    // while(counter <= n){
    //   System.out.print(counter+" ");
    //   counter++;
    // }


  //Sum of N natural Number:

  System.out.println("Enter Range:");
   int range = sc.nextInt();
   int counter = 1;
   int sum = 0 ;
   
   while(counter <= range){
    sum = sum + counter;
    counter++;
   }
   System.out.println("Sum value is: " +sum);
  }
}
