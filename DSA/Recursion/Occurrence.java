public class Occurrence {

    //first occurrence problem
    public static int firstOccur(int arr[], int i , int key){
       
        if(arr[i] == key){
           return i;
        } 

        //base case
         if(i == arr.length-1){
            return -1;
        }

        return firstOccur(arr, i+1, key);     //calling recursive function


    }

    //last occurrence problem
    public static int lastOccurrence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurrence(arr, i+1, key);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    
    public static void main(String[] args) {
    //     int arr[] = {2,4,5,3,7,9};
    //     int key = 0;
    //   System.out.println( firstOccur(arr, 0,key));

    int arr[] = {2,4,5,4,2,9,5};
    int key = 5;
    System.out.println(lastOccurrence(arr, 0, key));


    }
}
