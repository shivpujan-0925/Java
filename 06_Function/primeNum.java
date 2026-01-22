public class primeNum {
       // Check number is prime OR Not:

       // public static boolean primeCheck(int num){
       // boolean isPrime = true;

       // //corner cases
       // if (num == 2) {
       // return true;
       // }

       // for(int i = 2; i <=num-1; i++){
       // if(num % i == 0){ //completly divide
       // isPrime = false;
       // break;

       // }
       // }
       // return isPrime;
       // }

       // optimized method:
       public static boolean isPrime(int num) {
              boolean isPrime = true;

              if (num == 2) {
                     return true;
              }
              for (int i = 2; i <= Math.sqrt(num); i++) {
                     if (num % i == 0) {
                            isPrime = false;
                     }

              }
              return isPrime;
       }

       // Print all Prime number in a Range:
       public static void PrimeInRange(int n) {
              System.out.println("Prime Number: ");
              for (int i = 2; i <= n; i++) {
                     if (isPrime(i) == true) { // calling isPrime function to check number is prime.
                            System.out.print(" " + i);
                     }

              }

       }

       public static void main(String args[]) {
              // System.out.println("Is Number Prime number: " + isPrime(9));
              PrimeInRange(27);
       }
}
