public class PrintNumbers {

    public static void printDigits(int n){
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        //base case
        if(n == 0){
            return;
        }

        int lastDigit = n % 10;  //use remainder as a last digit

        printDigits(n/10); //recursive call with input : n / 10;
        
        System.out.print(digits[lastDigit] + " ");  //printOut

    }
    public static void main(String[] args) {
        printDigits(2529);
    }
}
