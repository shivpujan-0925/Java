public class Recursion02 {
    
    //calculate factorial
    //____________________________________
    public static int Fact(int n){
        //base case
        if(n == 0){            //factorial of '0' is 1
            return 1;
        } 

        int FN_1 = Fact(n-1);    //finding factorial for (n-1), firstly
        int FN = n * FN_1;      //final result of factorial.
        return FN;
    }

//---------------------------------------------------------------------------------

  //Sum of N natural number

    public static int sum(int n){
        if(n == 1) return 1;  //base case

        int prevSum = sum(n-1);
        int Sum = n + prevSum;
        return Sum;
    }
    public static void main(String[] args) {
        int n = 5;
    //   System.out.println(Fact(n));

    System.out.print(sum(n));
    }
}
