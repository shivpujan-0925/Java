public class KADANEs {
      

//KADANE's Algorithm.

       public static void MaxSum_Subarr(int numbers[]){
              int currSum = 0;
              int maxSum = Integer.MIN_VALUE;

              for(int i = 0; i < numbers.length; i++){
                     int start = i;
                     currSum = start == 0 ? numbers[i] : currSum + numbers[i];

                     if(currSum <= 0){
                            currSum = 0;
                     }

                     // if(currSum > maxSum){
                     // maxSum = currSum;
                     // }

                     maxSum = Math.max(currSum, maxSum);
                  
          }

            

              System.out.println("Max sum: " + maxSum);
       }   


       public static void main(String[] args) {

              int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
              MaxSum_Subarr(numbers);

       }
}
