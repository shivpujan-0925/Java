public class FindOccurrenceIndices {

    public static void findKeyIndices(int arr[], int key, int idx){
        //base case
        if(idx == arr.length){
            return;
        }
         
        if(arr[idx] == key){
            System.out.print(idx + " ");
        }

      findKeyIndices(arr, key, idx+1);   //recursive call 
        
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,2,2};
        int key = 2;
        int idx = 0;
        findKeyIndices(arr,key , idx);
    }
}
