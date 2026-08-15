public class RotatedSortedArr {
    public static int search(int arr[],int target, int si, int ei){
        //base case
        if(si > ei) return -1;
        //find mid
        int mid =  si + (ei-si)/2;

       if(arr[mid] == target) return mid;  //case: FOUND 
       
       //search on line L1:
       if(arr[si] <= arr[mid]){
        //case-a:
         if(arr[si] <= target && target <= arr[mid] ){
            return search(arr, target, si, mid-1);
         }else{            //case-b
           return search(arr, target, mid+1, ei);
         }
       }else{     //search on line L2:

         //case-c:
         if(arr[mid] <= target && target <= arr[ei]){
              search(arr, target, mid+1, ei);
         }else{
             return search(arr, target, si, mid-1);   //case-d
            }
       }
      return -1;
       
    }


    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int targetIdx = search(arr, target, 0, arr.length-1);
        System.out.println(targetIdx);
    }
}
