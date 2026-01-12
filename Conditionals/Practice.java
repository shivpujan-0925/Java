import java.util.*;

public class Practice{
       public static void main(String args[]){
             Scanner sc = new Scanner(System.in);
             
       //       System.out.println("Enter Number:");
       //       int number = sc.nextInt();
             
       //       if(number > 0){
       //        System.out.println( number + " is Positive number");
       //       }
       //       else if(number < 0){
       //        System.out.println( number + " is Negative number");
       //       }
       //       else{
       //        System.out.println("Enter correct value");
       //       }
         
          
       //     double temperature = 103.5;
       //     if(temperature > 100){
       //        System.out.println("You have fever");
       //     }else{
       //        System.out.println("You don't have fever");
       //     }
         
         //OR


       //    double temperature = 103.5;
       //   String fever = (temperature > 100) ? "You have fever": "You don't have fever";
       //   System.out.println(fever);

       // System.out.println("Enter week day:");
       //  int week = sc.nextInt();
        
       //  switch(week){
       //        case 1: System.out.println(" Today is Monday");
       //               break;
       //        case 2: System.out.println("Today is Tuesday");
       //               break;
       //        case 3: System.out.println("Today is Wednesday");
       //               break;
       //        case 4: System.out.println(" Today is Thursday");
       //               break;
       //        case 5: System.out.println(" Today is Friday");
       //               break;
       //        case 6: System.out.println(" Today is Saturday");
       //               break;
       //        case 7: System.out.println(" Today is Sunday");
       //               break;
       //        default:System.out.println("Enter valid week number (1-7)");
       //  }

            //Leap year problem:
            
            System.out.println("Enter Year:");
            double year = sc.nextDouble();
            if(year%4 == 0){
               if(year % 100 == 0){
                         if(year % 400 == 0){
                             System.out.println( year + " Leap year");
                         }else{
                            System.out.println(year + " Not a Leap Year");
                         }
               }else{
                     System.out.println(year + " Lear year");
               }
            }else{
              System.out.println(year + " Not a Leap year");
            }

       }

}
