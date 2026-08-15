public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei) return;

        //last element:pivot
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si , int ei ){
        int pivot = arr[ei];
        int i = si-1; //  make place for element smaller than pivot.
        
        for(int j = si; j < arr.length; j++){  //swap for smaller element than pivot
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
            i++;
            int temp = pivot;   //swap for pivot
            arr[ei] = arr[i];
            arr[i] = temp;    //pivot index is : i

        return i;    

    }


    public static void printSortedArr(int arr[]){
        for(int idx = 0; idx < arr.length; idx++){
            System.out.print(arr[idx] + " ");
       
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,9,8,2,5};
        int si = 0;
        int ei = arr.length-1;
        quickSort(arr, si, ei);
        printSortedArr(arr);
    }
}
