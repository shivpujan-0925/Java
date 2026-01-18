import java.util.*;
public class TaxCalculator{
       public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
           int income = sc.nextInt();

            if(income <= 500000){
              int Tax = 0;
              System.out.println("Income:" + income);
              System.out.println("Your Tax:" + Tax);

            }
            else if(income > 500000 && income <= 1000000){
              float Tax = (income * 0.2f);
              System.out.println("Income:" + income);
              System.out.println("Your Tax:" + Tax);

            }
            else{
              float Tax = (income * 0.3f );
              System.out.println("Income:" + income);
              System.out.println("Your Tax:" + Tax);
            }
       }
}
