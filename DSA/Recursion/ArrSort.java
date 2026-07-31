public class ArrSort {
   public static boolean isSorted(int arr[], int i){

    //problem: check given array is SORTED or Not.
    int n = arr.length;
      //base case
       if(i == n-1){
        return true;
       }

      if(arr[i] > arr[i+1] ){
        return false;
      }
      //recursive calling
      return isSorted(arr, i+1);


   }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3};
        System.out.println(isSorted(arr, 0));
    }
}