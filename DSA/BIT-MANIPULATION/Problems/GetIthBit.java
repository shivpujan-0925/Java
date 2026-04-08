public class GetIthBit {
    //get ith bit
    // public static int getIthbit(int n, int i){
    //     int bitMask = 1 << i;
    //     if((n & bitMask) == 0){
    //         return 0;
    //     }else{
    //         return 1;
    //     }
    // }

    //set ith bit
    // public static int setIthBit(int n, int i){
    //     int bitMask = 1 << i;
    //     return n | bitMask;
    // }

    //Clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println( setIthBit(12, 3));
        System.out.println( clearIthBit(10, 1));
    }
}
