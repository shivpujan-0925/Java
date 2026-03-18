import java.util.*;

public class Sorting {
    
    //to print sorted arr
    public static void printArr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = {5,3,4,1,2};
        Integer arr[] = {5,3,4,1,2};
         
        //inbuilt sort
        // Arrays.sort(arr);

        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);




    }
}