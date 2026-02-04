import java.util.*;

public class arrayArg {


       public static void update(int marks[],int nonChangable){
         
              // nonChangable = 10;    //NOT Reflect in main function. [bcoz pass by value]

         for(int i=0; i < marks.length; i++){
              marks[i] = marks[i] + 1;    // Reflect in main function [ bcoz it is pass by refrence.]
         }

       }


       public static void main(String args[]){
              int marks[] = {97,99,96};
              
              int nonChangable = 5;   // pass by value 

              update(marks, nonChangable);

              System.out.println(nonChangable);

              //print marks
              for(int i =0; i < marks.length; i++){

                     System.out.println("marks: " + marks[i]);

              }
              System.out.println();
       }
}
