import java.util.Scanner;

public class Practice {

       // Problem-01: Method to compute avg of three number:
       public static int Average(int num1, int num2, int num3) {

              int averageValue = (num1 + num2 + num3) / 3;
              return averageValue;

       }

       // Problem-02:check number is even OR odd
       public static boolean isEven(int num) {

              if (num % 2 == 0) {
                     return true;
              } else {
                     return false;
              }

       }

       // problem-03: check given number is palindrome or Not
       public static boolean palindrome(int num) {
              int givenNum = num;
              int palidromeNum = 0;
              while (num > 0) {
                     int lastDigit = num % 10;
                     palidromeNum = palidromeNum * 10 + lastDigit;
                     num = num / 10;
              }

              if (palidromeNum == givenNum) {
                     return true;
              } else {
                     return false;
              }

       }

       // problem-05: sum of digit of an Integer number
       public static int Sum(int num) {
              int sum = 0;
              while (num > 0) {
                     int lastDigit = num % 10;
                     sum = sum + lastDigit;
                     num = num / 10;
              }
              return sum;
       }

       public static void main(String args[]) {
              Scanner sc = new Scanner(System.in);

              // (01)Average of 3 number
              // int num1;
              // int num2;
              // int num3;

              // System.out.println("Enter First Number");
              // num1 = sc.nextInt();
              // System.out.println("Enter second Number");
              // num2 = sc.nextInt();
              // System.out.println("Enter third Number");
              // num3 = sc.nextInt();

              // int avgValue = Average(num1, num2, num3);
              // System.out.println("Average Value :" + avgValue);

              // (02)Check number is Even OR Not:
              // int num;
              // System.out.println("Enter Integer Number");
              // num = sc.nextInt();
              // if(isEven(num)){
              // System.out.println("Number is Even");
              // }else{
              // System.out.println("Number is Odd");
              // }

              // p-03: check number is palindrome
              // int num;
              // System.out.println("Enter number to check is it Palindrome or NOT");
              // num = sc.nextInt();
              // if (palindrome(num)) {
              // System.out.println(num +" is Palindrome number");
              // }else{
              // System.out.println(num + " is Not a Palindrome Number");
              // }

              // p-05: sum of the digit of an integer number.
              int num;
              System.out.println("Enter number");
              num = sc.nextInt();
              int sumOfDigit = Sum(num);
              System.out.println("Sum of Digit of Number is " + sumOfDigit);

       }
}
