
public class Strings {
    public static boolean isPlalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n/2; i++){
            //Not a palindrome condition
            if(str.charAt(i) != str.charAt(n- i-1)){
                return false;
            }

        }
        return true;
    }
     public static void main(String[] args) {
        String str= "mom";
        System.out.println(isPlalindrome(str));
     }
}
