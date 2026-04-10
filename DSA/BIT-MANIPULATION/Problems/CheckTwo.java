public class CheckTwo {
    public static int checkNum(int n){
        if((n & n-1 )== 0){
            System.out.println(n + " is power of 2");
        }else {
            System.out.println(n + " is Not a Power of 2");
        }
        return n;
    }
    public static void main(String[] args) {
        checkNum(9);
    }
}
