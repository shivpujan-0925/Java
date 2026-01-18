import java.util.*;

public class LargestValue{
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              int A =10;
              int B = 98 ;
              int C = 100;
              if((A >= B) && (A >= C)){
                     System.out.println("A is Largest value");
              }
              else if(B >= C){
                     System.out.println("B is Largest Value");
              }
              else{
                     System.out.println("C is Largest Value");
              }
       }
}
