
// Function OverLoading => 
       //when using multiple function with same name but different parameter(types different or no. of params different).




//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

public class Overloading {
    //different no. of paramter
       //func to sum of 2 nums
       // public static int sum(int a , int b){
       //        return a+b;
       // }


       //func to sum of 3 nums
       // public static int sum(int a , int b, int c){
       //        return a+b+c;
       // }
  //different types of parameter.
        // to calculate sum of integer number
       public static int sum(int num1, int num2){
           return num1 + num2;
       }
        // to calculate sum of float number
        public static float sum(float num1, float num2){
              return num1 + num2;
        }

       public static void main(String args[]){
           System.out.println("Sum of 2 Number: "+ sum(6, 7));
          System.out.println(sum(2.5f, 2.9f));
       //System.out.println("Sum of 3 Number: "+ sum(6, 7,8));
       }
}
