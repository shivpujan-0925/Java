public class pairsArray {

     //pairs in array
       public static void pairArray(int numbers[]){
           int totalPair =0;
           for(int i =0; i < numbers.length; i++ ){

              for(int j = i +1; j < numbers.length; j++){
                     System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                     totalPair++;
              }

               System.out.println();
           }
          System.out.println("Total Pair: " + totalPair);
       }


    public static void main(String[] args) {
       int numbers[] = {2,3,5,6,7,8,9};
       pairArray(numbers);

       
    }
}
