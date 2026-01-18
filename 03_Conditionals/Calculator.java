import java.util.*;
public class Calculator{
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter First Number:");
              int number1 = sc.nextInt();

              System.out.println("Enter Second Number:");
              int number2 = sc.nextInt();

              System.out.println("Choose Operation: + - * / %"); 
              char operation = sc.next().charAt(0);

              switch(operation){
                 case '+' : System.out.println("SUM:" + (number1 + number2));
                             break;
                           
                 case '-' : System.out.println("SUB:" + (number1 - number2));
                            break;

                 case '*' : System.out.println("MULTIPLE:" + (number1 * number2));
                            break;
                 case '/' : System.out.println("DIVISION:" + (number1 / number2));
                            break;           
                 case '%' : System.out.println("REMAINDER:" + (number1 % number2));
                            break; 

                 default: System.out.println("Wrong Operator");
              }

       }
}