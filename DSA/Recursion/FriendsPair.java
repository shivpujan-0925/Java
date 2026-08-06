public class FriendsPair {

    public static int friendsPairing(int n){
      //base case
      if(n == 1 || n == 2){
        return n;
      }

    //   //choice 
    //   //-single
    //   int singlePair = friendsPairing(n-1);

    //   //-paired
    //   int pairChoice = friendsPairing(n-2);
    //   int pairedTotal = (n-1)*pairChoice;

    //   int totalWays = singlePair + pairedTotal;
    //   return totalWays;
    
    //other way to write :
    return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);

    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(5));
    }
}
