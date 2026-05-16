public class Recursion02 {
    
    //calculate factorial
    //____________________________________

    // public static int Fact(int n ){
    //     //Base case
    //     if(n == 0){
    //         return 1;
    //     }

    //     int Fn_1 = Fact(n-1);
    //     int Fn = n * Fn_1;

    //     return Fn;
    // }

//---------------------------------------------------------------------------------

  //Sum of N natural number

  public static int sum(int n){
    if(n == 1){
        return 1;
    }
    int prevSum = sum(n-1);
    int totalSum = n + prevSum;
    return totalSum;
  }

    public static void main(String[] args) {
        int n = 5;
    //   System.out.println(Fact(n));

    System.out.print(sum(n));
    }
}
