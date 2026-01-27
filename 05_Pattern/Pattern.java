import java.util.Scanner;

public class Pattern {
       public static void main(String args[]){
              Scanner scn = new Scanner(System.in);
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

       for(int row = 1; row <=n; row++){
              for(int col = 1; col <= n; col++){
                     if(col <= row){
                            System.out.print("* ");
                     }else{
                            System.out.print("");
                     }
              }
              System.out.println();
       }

       
       // Top-left triangle

       // for(int row = 1; row <=n; row++){
       //        for(int star = n; star >= row; star--){
       //               System.out.print("* ");
       //        }
       //        System.out.println();
       // }

       //count Triangle

       // for(int row = 1; row <= n; row++){
       //        for(int counter = 1; counter<=row; counter++){
       //               System.out.print(counter+" ");
       //        }
       //        System.out.println();
       // }


       }
}

