public class CheckSetBits {

    public static int checksetBit(int n ){
       int bitsCount = 0;
       while (n > 0) {
        if((n & 1) != 0){   //check LSB 
            bitsCount++;
  
        }

         n = n>>1;
       }

       return bitsCount;
    }
    public static void main(String[] args) {
        System.out.println(checksetBit(15));
    }
}
