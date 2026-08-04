public class Tiling {
    public static int tilingProblem(int n){    //2 x n floor size;
      //base case
      if(n == 0 || n == 1){
        return 1;
      }

      //choice-> vertical
      int verticalWay  =  tilingProblem(n-1);

      //choice-> horizontaly
      int horizonWay = tilingProblem(n-2);

      //total ways
      int totalWays = verticalWay + horizonWay;
      return totalWays;

    }
    public static void main(String[] args) {
       System.out.println( tilingProblem(4));
    }
}
