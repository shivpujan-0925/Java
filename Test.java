import java.util.*;
public class Test{
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);

              // System.out.println("Enter the value of X");
              // int x = sc.nextInt();

              // System.out.println("Enter the value of ");
              // int y = sc.nextInt();

              // x = x+y;
              // y = x - y;
              // x = x - y;

              // System.out.println("X: " + x);
              // System.out.println("Y: " + y);

              // char digit = '8';
              // int value = digit - '0';
              // System.out.println(value);

              // System.out.println(10 + 0 == 10);  //true
              // System.out.println(10 / 0 == 10); // runtime error
              // System.out.println(10*0 == 10);

              //  System.out.println(10 + 0 == 10);  
              // System.out.println(10 + 0 = 10);   //compilation error
              // System.out.println(10 * 0 == 10);
           


       //     System.out.println(10 + 5 > 4 && 5 + 7 > 10); //true
       //     System.out.println(10 + 5 < 4 && 5 + 7 > 10); //false
       //     System.out.println(10 + 5 < 4 && 5 / 0 > 10); //false


       //     System.out.println(10 + 5 < 4 || 5 + 7 > 10); //true
       //     System.out.println(10 + 5 > 4 || 5 + 7 > 10); //true 
       //     System.out.println(10 + 5 > 4 || 5 / 0 > 10); //true


       // int x = 2 , y = 5;
       // int exp1 = (x * y / x);
       // int exp2 = (x * (y / x));
       // System.out.println(exp1 + ",");
       // System.out.println(exp2);


       // int x,y,z;
       // x = y = z = 2;
       // x += y;
       // y -= z;
       // z /= (x + y);
       // System.out.println(x + ""+ y + "" + z);



       // int x = 9 , y = 12;
       // int a = 2 , b = 4 , c = 6;
       // int exp = 4/3 * (x + 34) + 9*(a + b*c) + (3 + y*(2 + a))/(a + b * y);
       // System.out.println(exp);

       int x = 10, y = 5;
       int exp1 = (y* (x/y + x/y));
       int exp2 = (y*x/y + y*x/y );
       System.out.println(exp1);
       System.out.println(exp2);

       }
}
