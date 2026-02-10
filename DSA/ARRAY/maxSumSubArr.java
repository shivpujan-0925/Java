public class maxSumSubArr {

      public static void maxSum(int numbers[]){

       //brute force:

       //     int maxSum_SubArr = Integer.MIN_VALUE;

       //     for(int i =0; i < numbers.length; i++){

       
       //        for(int j=i; j < numbers.length; j++){

       //           int currSum = 0;
       //          for(int k=i; k <=j; k++){
       //               System.out.print(numbers[k] + " ");
       //               currSum = currSum + numbers[k];
       //          }

       //         if(maxSum_SubArr < currSum){
       //               maxSum_SubArr = currSum;
       //         } 
            
       //        }
            
       //     }
       //     System.out.println("Maximum sum of SubArray is : " + maxSum_SubArr);


       //PREFIX SUM METHOD:   optimized
          
       int currSum = 0;
       int maxSum_subArray = Integer.MIN_VALUE;
       int prefix[] = new int[numbers.length];
       prefix[0] = numbers[0];

       //calculating prefix
       for(int i=1; i <numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
       }
      
       for(int i=0; i < numbers.length; i++){
              int start =i;
              for(int j = i; j<numbers.length; j++){
                 
                     int end = j;
                     currSum = start ==0 ? prefix[end]: prefix[end] - prefix[start -1];
              }
              if(currSum > maxSum_subArray){
                     maxSum_subArray = currSum;
              }
       }

       System.out.println("Max Sum: " + maxSum_subArray);
            
      }


       public static void main(String args[]){
           int numbers[] = {10,-2,6,-1,3};
           maxSum(numbers);
       }
}
