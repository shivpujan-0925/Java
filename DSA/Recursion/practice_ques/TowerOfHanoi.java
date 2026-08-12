public class TowerOfHanoi {
    public static void TOH(int n, int a , int b, int c){

        //a=> source
        //b => helper
        //c => destination

        if(n == 0){  //base case
            return;
        }
        
        TOH(n-1, a, c, b);
        System.out.println("MOVE "+ a +" TO " + c);
        TOH(n-1, b , a, c);
     }
    public static void main(String[] args) {
        TOH(10, 1, 2, 3);
    }
}
