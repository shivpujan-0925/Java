public class FloydTriangle {


       public static void Floyd(int n){
              int counter = 1;
           for(int row = 1; row<=n; row++){
              for(int col = 1; col<=row; col++){
                     System.out.print(counter + " ");
                 counter = counter+1;

              }
              System.out.println();
           }
       }
       public static void main(String args[]){
               Floyd(5);
       }
}
