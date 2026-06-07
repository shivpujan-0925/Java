public class pairsArray {

   //printing pair of array elements.
   public static void arrPair(int numbers[]){
      int n = numbers.length;
      int totalPair = 0;
      for(int i = 0; i < n; i++){
         for(int j = i + 1; j < n; j++){
            System.out.print( "(" + numbers[i] + "," + numbers[j] + ") ");
             totalPair++;
         }
         System.out.println();
         
        
      }
      System.out.println("Total pair of array :" + totalPair);
   }
   public static void main(String[] args) {
      int numbers[] = {2,3,5,6,7,8,9};
      arrPair(numbers);
   }
}