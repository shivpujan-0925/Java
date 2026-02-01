import java.util.Scanner;

public class Pattern {
       public static void main(String args[]){
              Scanner scn = new Scanner(System.in);
              System.out.println("Enter value of n");
              int n = scn.nextInt();

              //square grid
       //       for(int row = 1; row<=n; row++ ){
       //        for(int col =1; col<=n; col++ ){
       //               System.out.print("* ");
       //        }
       //        System.out.println();
       //       }

           //bottom left triangle

       //     for(int row = 1; row <=n; row++){
       //        for(int star = 1; star<=row; star++){
       //               System.out.print("* ");
       //        }
       //        System.out.println();
       //     }

       //another way:

       // for(int row = 1; row <=n; row++){
       //        for(int col = 1; col <= n; col++){
       //               if(col <= row){
       //                      System.out.print("* ");
       //               }else{
       //                      System.out.print("");
       //               }
       //        }
       //        System.out.println();
       // }

       
       // Top-left triangle

       // for(int row = 1; row <=n; row++){
       //        for(int star = n; star >= row; star--){
       //               System.out.print("* ");
       //        }
       //        System.out.println();
       // }


       //another way:
       
       // for(int row = 1; row<=n; row++){
       //        for(int col = 1; col<=n; col++){
       //           if(col + row <= n+1){
       //              System.out.print(" * ");
       //           }
                     
       //        }
       //        System.out.println();
                      
       // }


       //Top-right triangle:
       // for(int row =1; row<=n; row++){
       //     for(int col = 1; col<=n; col++){
       //        if(row <= col){
       //               System.out.print("* ");
       //        }else{
       //               System.out.print("__");
       //        }
       //     }
       //     System.out.println();
       // }



   // X-Pattern:
      for(int row = 1; row <=n; row++){
         for(int col = 1; col <=n; col++){

         
              // if(row == col || row + col == n+1){
              //        System.out.print("*");
              // }else{
              //        System.out.print(" ");
              // }
              

           //To print center star:

              if(row == col && row + col == n+1){
                     System.out.print("*");
              }
              else{
                     System.out.print("_");
              }
         }
         System.out.println();
      }


       //count Triangle

       // for(int row = 1; row <= n; row++){
       //        for(int counter = 1; counter<=row; counter++){
       //               System.out.print(counter+" ");
       //        }
       //        System.out.println();
       // }


       }

}
