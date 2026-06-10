public class KADANEs {
      

//KADANE's Algorithm.

       public static void  MaxSum_Subarr(int numbers[]){
              int maxSum = Integer.MIN_VALUE;
              int currSum = 0;
              int n = numbers.length;

              for(int i = 0; i < n; i++){
                  currSum = currSum + numbers[i];
                  if(currSum < 0){                  //kadane's algo
                     currSum = 0;
                  }
                  maxSum = Math.max(maxSum, currSum);
                 

              }
              System.out.println("Max sum of subarray : " + maxSum);
       }

       public static void main(String[] args) {

              int numbers[] = {5,4,-1,7,8};
              MaxSum_Subarr(numbers);

       }
}
