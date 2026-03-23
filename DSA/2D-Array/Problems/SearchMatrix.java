package Problems;
public class SearchMatrix {
    
    public static boolean searchMatrix(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;

        //aproach=> up to down

        // int row = 0;
        // int col = m-1;

        // while(row <= n-1 && col >= 0){
        //     if(key == matrix[row][col]){
        //       return true;
        //     }
        //     else if(key > matrix[row][col]){
        //         row++;
        //     }else {
        //         col--;
        //     }
        // }
        // return false;


        //approach => down to up

        int row = n-1;
        int col = 0;
        while(col < m && row >= 0){
            if(key == matrix[row][col]){
                return true;
            }
            else if(key > matrix[row][col]){
                col++;
            }else {
                row--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{4,5,6,10},
                          {12,13,14,20},
                          {25,29,30,35},
                          {40,50,60,70}};
       System.out.println( searchMatrix(matrix, 80));
    }
}
