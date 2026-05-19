public class Power {

    public static int power(int x, int n ){

        //base case
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
   
    //optimized code 

    public static int optimizedPower(int a , int n ) {
        //base case
        if(n == 0){
            return 1;
        }

    //    int halfsqrPower =  optimizedPower(a, n/2) * optimizedPower(a, n/2);    ==> not optimized

    int halfPower = optimizedPower(a, n/2);
    int halfsqrPower = halfPower * halfPower;

       //n is odd 
       if(n % 2 != 0){
        return a * halfsqrPower;
       }

       return halfsqrPower;
    }

    public static void main(String[] args){
        // int x = 3;
        // int n = 9;
    //  System.out.println(power(x,n));

    int a = 2;
    int n = 5;
    System.out.println(optimizedPower(a, n));

    }
}
