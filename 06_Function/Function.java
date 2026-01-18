// FUNCTION / METHOD:- Block of code | reusable

//syntax=> 
       // returnType name(){

              //body
              //return statement;
       // }


// synatx with parameters:
       // returnType name(type param1, type param2){
       //        body
       //        return statement;
       // }       



// Parameter v/s Arguments:
// (1) formal params OR params (=> in the function definition) 
// (2) actual params OR arguments ( => in the function call)     


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++       

import java.util.*;

public class Function{

       public static void printHelloWorld(){
              System.out.println("Hello World");
             
       }
       
       // function for calculate two number:

       public static int calculateSum(int num1 , int num2){ //parameteres or formal parameter.
          int sum = num1 + num2;
          return sum;
       }

       public static void main(String args[]){
              //  printHelloWorld();  //function call

              // Scanner sc = new Scanner(System.in);
              // System.out.println("Enter first number");
              // int a = sc.nextInt();

              // System.out.println("Enter second number");
              // int b = sc.nextInt();

              //  int sum = calculateSum(a,b);   //arguments or actual parameters
              //  System.out.println("Sum is:" + sum);


              //Swap- Values Exchanges

              int a = 5;
              int b = 10;
            
              //Swap
              int temp = a;
              a = b;
              b = temp;
              System.out.println("a = " + a);
              System.out.println("b = " + b);
              

              
       }
}
