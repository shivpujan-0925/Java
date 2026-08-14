public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){

        //base case
        if(si >= ei){
            return;
        }

        //finding mid 
        int mid = si + (ei-si)/2;
        
        mergeSort(arr, si, mid);  //sort left part
        mergeSort(arr, mid+1, ei); //sort right part

        merge(arr, si, ei, mid);   //call to merge 


    }
    
    public static void merge(int arr[], int si, int ei, int mid){
       int temp[] = new int[ei-si+1];
       int i = si;  //iterator for left part
       int j = mid + 1; //iterator for right part
       int k = 0; // iterator for temp array

       while(i <= mid && j <= ei){
            temp[k++] = (arr[i] < arr[j]) ? arr[i++]: arr[j++];  
       }

       while(i <= mid){   //when right part completely added to temp but still left pert remains
        temp[k++] = arr[i++];
       }
 
       while(j <= ei){    //when left part completely added to temp but still right part remains.
        temp[k++] = arr[j++];
       }

      //copy temp to original array
       for( k = 0, i = si; k < temp.length; k++ , i++){
          arr[i] = temp[k];
       }
    }

    //print sorted array
    public static void printArr(int arr[]){
        for(int i=0;  i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,6,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
