import java.util.*;
public class Ifelse {
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter your Age");
              int age = sc.nextInt();

              if(age >= 18){
                     System.out.println("You are Adult: Eligible for - Vote, Drive");
              }
              
              if(age > 13 && age < 18){
                     System.out.println("You are Teenanger");
              }
              
              else{
                     System.out.println("You are Not Adult");
              }


       }
}