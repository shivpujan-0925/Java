public class Nqueens {

    public static boolean isSafe(char board[][], int row, int col){
        //check:vertically up
        for(int i=row-1; i>=0; i--){
           if(board[i][col] == 'Q'){
              return false;
           }
        }

        //check: diag, left up
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //check: diag, right up
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row){
            //base case:
            if(row == board.length){
                // printChess(board);
                count++;
                return;
            }
            
            for(int j = 0; j < board.length; j++){

                if(isSafe(board, row, j)){
                  board[row][j] = 'Q';
                  nQueens(board, row+1);    //recursive step
                  board[row][j] = 'x';      //backtraping step.
                }


            }
        
    }

    //print chess:
    public static void printChess(char board[][]){
        System.out.println("___CHESS BOARD____");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            

        }
       
        System.out.println();
    }

    static int count = 0;
    public static void main(String[] args) {
        int n = 7;
        char board[][] = new char[n][n];

        //initialize
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = 'x';
            }
        }
        
        nQueens(board, 0);
        System.out.println("Total ways to solve " + n + " Queens : " + count);
    }
}
