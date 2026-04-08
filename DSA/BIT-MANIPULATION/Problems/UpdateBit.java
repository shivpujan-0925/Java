public class UpdateBit {
    //set iTH Bit
    public static int setIthBit(int n, int i){
        int bitMask = (1 << i);
        return n | bitMask;
    }

    //clear iTH Bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
   //Update Ith Bits 
    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit == 0){
           return  clearIthBit(n, i);
        }else {
            return setIthBit(n, i);
        }
    }


    //clear Last iTH Bits
    public static int clearLasIthBit(int n , int i){
        int BitMask = ~0 << i;
        return n & BitMask;
    }


    public static void main(String[] args) {
        // System.out.println(UpdateIthBit(10, 2, 0));
       System.out.println( clearLasIthBit(15, 2));
    }
}
