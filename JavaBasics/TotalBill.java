import java.util.*;

public class TotalBill{
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter the Price of Pencil");
              float pencil = sc.nextFloat();

              System.out.println("Enter the Price of Pen");
              float pen =  sc.nextFloat();

              System.out.println("Enter the Price of Erazer");
              float erazer = sc.nextFloat();

              float Cost = pencil + pen + erazer;
              float Tax = Cost * 0.18f;
              float Total_price = Cost + Tax;
              System.out.println("Tota Bill :" + Total_price);
          


       }
}
