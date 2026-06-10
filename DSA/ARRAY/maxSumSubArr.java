public class maxSumSubArr {

        //BRUTEFORCE APPROACH:

        // public static void maxSum(int numbers[]){
        //   int maxSum = Integer.MIN_VALUE;
        //   int currSum = 0;
        //   int n = numbers.length;

        //   for(int i = 0; i < n; i++ ){

        //     int start = i;
        //     for(int j = i + 1; j < n; j++){
        //       currSum = 0;
        //       int end = j;

        //         for(int k = start; k <= end; k++){
        //         currSum = currSum + numbers[k];
               
        //         }
        //          System.out.println(currSum);

        //         if(maxSum < currSum){
        //         maxSum = currSum;
        //         }

        //     }
        //   }
        //   System.out.println("Maximum sum of subArr : " + maxSum);
        // }



       //Optimized way : Using prefix sum

       public static void maxSum(int numbers[]){
          int n = numbers.length;
          int maxSum = Integer.MIN_VALUE;
          int currSum = 0;
          
          //calculating prefix sum
          int prefix[] = new int[n];
          prefix[0] = numbers[0];
          
          for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + numbers[i];
          }
          
          for(int i = 0; i < n; i++){
            int start = i;

            for(int j = i+1; j < n; j++){
              int end = j;

              currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
            }

            if(maxSum < currSum){
              maxSum = currSum;
            }
          }
          System.out.println("Maximum sum of subArray : " + maxSum);

       }
     

       public static void main(String args[]){
           int numbers[] = {1, -2, 6, -1, 3};
           maxSum(numbers);
       }

}
