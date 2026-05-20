public class FriendsPair {

    public static int friendsPairing(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }
        // //choice
        // //single
        // int singleWays = friendsPairing(n-1);
    
        // //paired
        // int pairedWays = friendsPairing(n-1) * friendsPairing(n-2);

        // //Total ways
        // int totalWays = singleWays + pairedWays;
        // return totalWays;


        //other way to write code
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
