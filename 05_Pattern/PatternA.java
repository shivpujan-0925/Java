import java.util.Scanner;

public class PatternA {

       public static void Hollow_rectangle(int row, int col) {

              // Print Hollow_Rectangle.

              for (int i = 1; i <= row; i++) {
                     for (int j = 1; j <= col; j++) {
                            
                            // logic[itself]

                            // if((i == 1 && j <= col) || (j==1 && i <= row) || (j == col && i <= row) || (i
                            // == row && j <=col ) ){
                            // System.out.print("* ");
                            // } else{
                            // System.out.print(" ");
                            // }

                            // }
                            // System.out.println();


                            // Another logic:Optimized

                            if (i == 1 || i == row || j == 1 || j == col) {
                                   System.out.print("* ");
                            } else {
                                   System.out.print("  ");
                            }

                     }
                     System.out.println();
              }
       }

       public static void main(String args[]) {
              Scanner scn = new Scanner(System.in);

              // Print Hollow-reactangle
              System.out.println("Enter Number of Row");
              int row = scn.nextInt();
              System.out.println("Enter Number of column");

              int col = scn.nextInt();

              Hollow_rectangle(row, col);

       }
       
}
