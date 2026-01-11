import java.util.*;


// #Ternary operator - three operands

// Syntax: 

// variable: condition? statement1 :statement2;

// => if statemenet1 is TRUE then statement1 value will be assigned to variable.
// => if statemenet1 is FALSE then statement2 value will be assigned to variable

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// public class ternary{
//        public static void main(String args[]){

//        //       int larger = (5 > 3)? 5 : 2;
//        //        System.out.println(larger);


//        int number = 7;
//        String type = ((number%2) == 0) ? "Even" : "Odd";
//        System.out.println(type);
//        }
// }

//Student Pass or Fail problem:

public class ternary{
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter Your marks");
              int marks = sc.nextInt();
              String reportCard = (marks >= 33)? "Pass": "Fail";
              
              System.out.println(reportCard);
       }
}



