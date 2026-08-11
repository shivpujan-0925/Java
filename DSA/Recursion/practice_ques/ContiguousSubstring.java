public class ContiguousSubstring {
    //brute-force approach:
    public static int CountContiguousSubstring(int i , int j , String str){
       int n = str.length();
       int count = 0;
        //base case
        if(i == n) return 0;   //i => anchor index

         if(j == n) {      //j => scannner index
           return  CountContiguousSubstring(i+1, i+1, str);    //j = i+1;
        }
        
        if(str.charAt(i) == str.charAt(j)){
            count++;
        }

        return count + CountContiguousSubstring(i, j+1, str);
                
    }


    public static void main(String[] args) {
        int i = 0;
        int j = i;
        String str = "aba";
        System.out.println(CountContiguousSubstring(i, j, str));


    }
}
