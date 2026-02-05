public class linearSearch {
       
        //Linear Search
    //    public static int LinearSearch(int numbers[], int key){
    //        for(int i =0; i < numbers.length; i++){

    //           if(numbers[i] == key){
    //                 return i;
    //           }
    //        }
    //        return -1;
    //    }


    //Largest number

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;    //-infinity
        int smallest = Integer.MAX_VALUE;


        for(int i =0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }

            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
          
          System.out.println("Smallest number is : " + smallest);
          return largest;

    }



       public static void main(String args[]){
           int numbers[] = {2,4,6,8,10,12,14,16};
            int largest = getLargest(numbers);

           System.out.println("Largest number: "+ largest);

         
        //    int key = 15;
        //    int index =  LinearSearch(numbers, key);

        //    if(index == -1){
        //       System.out.println("NOT Found");
        //    }else{
        //           System.out.println("Key is at Index : " + index);
        //    }

       }
}
