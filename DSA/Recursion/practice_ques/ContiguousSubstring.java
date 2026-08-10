public class ContiguousSubstring {
    //brute-force approach:
    public static int FindContiguousSubstring(int i , int j , String str){
        int n = str.length();
       int count = 0;
        //base case
        if(i == n) return 0;

         if(j == n) {
           return  FindContiguousSubstring(i+1, i+1, str);
        }
        
        if(str.charAt(i) == str.charAt(j)){
            count++;
        }

        return count + FindContiguousSubstring(i, j+1, str);
        

            
    }
    public static void main(String[] args) {
        int i = 0;
        int j = i;
        String str = "abcab";
        System.out.println(FindContiguousSubstring(i, j, str));
    }
}
