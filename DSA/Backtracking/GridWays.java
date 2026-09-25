public class GridWays {

    public static int countWays(int row, int col, int n, int m ){
      // base case
      if(row == n-1 && col == m-1){  // target checks
         return 1;
      }else if( row == n || col == m){   //boundary condition check 
        return 0;
      }
      
      int rightWay = countWays(row, col + 1, n, m);   //right choice
      int downWay = countWays(row + 1, col, n, m);   //down choice

      return rightWay + downWay;   //total ways to reach target point.
  
    }

    public static void main(String[] args) {

        //row X col grid
        int n = 5;
        int m = 5;
        System.out.println(countWays(0, 0, n,m ));
    
    }
}