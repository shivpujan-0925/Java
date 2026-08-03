public class Power {

    public static int power(int x, int n){
        //base case
        if(n == 0) return 1;

        // int XN_1 = power(x, n-1);
        // return x * XN_1;

        return x * power(x, n-1);
   
    }


    //optimized code 

    public static int optimizedPower(int a , int n ) {
        //base case
        if(n == 0){
            return 1;
        }

    //    int halfsqrPower =  optimizedPower(a, n/2) * optimizedPower(a, n/2);    ==> not optimized
     
    int halfPower = optimizedPower(a, n/2);  //recursive calling with n/2 value of power
    int halfPowersqr = halfPower * halfPower;

    //n is odd 
    if(n % 2 != 0){
        halfPowersqr = a * halfPowersqr;
    }
    return halfPowersqr;

    }

    public static void main(String[] args){
    //     int x = 2;
    //     int n = 10;
    //  System.out.println(power(x,n));

    int a = 2;
    int n = 9;
    System.out.println(optimizedPower(a, n));

    }
}
