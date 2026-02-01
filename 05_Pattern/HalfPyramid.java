import java.util.*;

public class HalfPyramid {

//Inverted-half-pyramid

       // public static void Pyramid(int n ){
       //        for(int row = 1; row <= n; row++){
       //               for(int col = 1; col <=n; col++){
       //                      if(n + 1 <= row + col){
       //                             System.out.print("* ");
       //                      }else{
       //                             System.out.print("__");
       //                      }
       //               }
       //               System.out.println();
       //        }
       // }

//Inverted-half-pyramid-number

       // public static void NumericPyramid(int n){
       //     for(int row = 1; row <=n; row++){
       //        for(int col =1; col <=n; col++){
       //               if(row + col <= n+1){
       //                      System.out.print(col);
       //               }else{
       //                      System.out.print(" ");
       //               }
       //        }
       //        System.out.println();
       //     }
       // }

       //another Logic:

       public static void NumericPyramid(int n){
            
              for(int row = 1; row <=n; row++){
                     for(int col = 1; col <= n - row +1; col++){

                       System.out.print(col);

                     }
                     System.out.println();
              }
       }


       public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        NumericPyramid(n);

       //     Pyramid(n);
       }

}
