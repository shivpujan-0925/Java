
public class OddEven {
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println(n+ " is a Even number");
        }else {
            System.out.println(n + " is a Odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(9);
    }
}
