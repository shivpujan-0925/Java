public class Fibbonacci {
    public static int fibo(int n){
      
        if(n == 0 || n == 1 ){
            return n;
        }

        int Fn_1 = fibo(n-1);
        int Fn_2 = fibo(n-2);

        int Fn = Fn_1 + Fn_2;
        return Fn;
    }
    public static void main(String[] args) {
        int n = 25;
      System.out.println(fibo(n));
    }
    
}