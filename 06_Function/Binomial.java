public class Binomial {

   // Finding Binomial Coefficient.

   public static int Factorial(int num){
       int fact = 1;  
       for(int i = 1; i<=num; i++){
              fact = fact * i;
              
       }
       return fact;
     
     }
    
     public static int BinoCoefficient(int n, int r){
          
       int Fact_n = Factorial(n);
       int Fact_r = Factorial(r);
       int Fact_nmr = Factorial(n - r);
      
       int BinoCoefficient = Fact_n / (Fact_r * Fact_nmr);
       return BinoCoefficient;

     }

       public static void main(String args[]){
              int result = BinoCoefficient(29,25);    
              System.out.println("Binomial Coefficient:" + result);

       }
}
