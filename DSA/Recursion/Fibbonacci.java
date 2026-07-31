public class Fibbonacci {
  public static int fibo(int n) {
     //base case
     if(n == 0 || n == 1){
        return n;
     }

     //0th fibbonacci value
     int fibN_2 = fibo(n-2);

     //1st fibbonacci value
     int fibN_1 = fibo(n-1);

    //final fibbonacci value
     int fibN = fibN_2 + fibN_1;
     return fibN;
     
  
  }
    public static void main(String[] args) {
        int n = 99;
      System.out.println(fibo(n));
    }
    
}