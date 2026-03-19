public class Test {

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){

            int minimumPos = i;
            for(int j =i+1; j<n; j++){
               if(arr[minimumPos] > arr[j]){
                 minimumPos = j;
               }
            }

            //swap

            int temp = arr[minimumPos];
            arr[minimumPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
      int arr[] = {3,1,9,0,3,5,7,8};

      selectionSort(arr);
      printArr(arr);

   }
   
}
