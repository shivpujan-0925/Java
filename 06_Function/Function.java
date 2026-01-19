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

       
       //Swap- Values Exchanges
       public static void swap(int a, int b){
           //Swap
              int temp = a;
              a = b;
              b = temp;
              System.out.println("a = " + a);
              System.out.println("b = " + b);
       }




       //Product of a & b;
       public static int Product(int a, int b){
              int product = a * b;
              return product;
              
       }

       // Factorial of a Number

       public static int Factorial( int num){
              int fact = 1;
              for(int i = 1; i<=num; i++){
                  fact = fact * i;   //factorial
                  
              }
              return fact;
            
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
              // int a = 5;
              // int b = 10;
              // swap(a, b);
             
              //Product of a & b
             
              // int result = Product(25, 29);
              // System.out.println( "a * b =" +result);


              //Factorial of a Number
              // int fact = Factorial(5);
              // System.out.println(fact);


      
              
       }
}


