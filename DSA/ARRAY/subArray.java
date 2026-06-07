public class subArray {
       public static void printSubArr(int nums[]){
              int n = nums.length;
              int totalSubArr = 0;
              //start
              for(int i = 0; i < n; i++ ){
                     int start = i;
                  for(int j = i; j < n; j++){
                     int end = j;

                     //print subArr
                     for(int k = start; k < end; k++){
                            System.out.print(nums[k] + " ");
                            
                     }
                     totalSubArr++;
                     System.out.print("  ");

                  }
             
                  System.out.println();   
              }
              System.out.println(totalSubArr);
       }
       public static void main(String[] args) {
              int nums[] = {2,4,3,5,1,8,9};
              printSubArr(nums);
       }
}