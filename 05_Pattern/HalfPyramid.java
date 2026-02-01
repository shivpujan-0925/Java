import java.util.*;

public class HalfPyramid {


       public static void Pyramid(int n ){
              for(int row = 1; row <= n; row++){
                     for(int col = 1; col <=n; col++){
                            if(n + 1 <= row + col){
                                   System.out.print("* ");
                            }else{
                                   System.out.print("__");
                            }
                     }
                     System.out.println();
              }
       }


       public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

           Pyramid(n);
       }
}
