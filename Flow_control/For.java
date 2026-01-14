// For Loop:

//Syntax-
// for(initialization; condition; updation;){


// }


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


public class For{
  public static void main(String args[]){
       //    for( int i=0; i<=10; i++){
       //        System.out.println("Hello Engineer");


       //Print Square pattern

       // for(int line=1; line <= 4; line++){
       //        System.out.println("****");
       // }

       //  int line = 1;
       //  while(line <=4){
       //        System.out.println("****");
       //        line++;
       //  }


       // Print reverse of Number:
      
       // int number = 2925;
       // while(number > 0){
       //        int remainder = (number % 10);
       //        System.out.print(remainder);
       //        number = number / 10;

       // }
       

    // Reverse the given number
      
      int number = 10000;
      int revNumber = 0;
      while(number > 0){
       int  lastDigit = number % 10;
        revNumber = (revNumber * 10) + lastDigit;
        number = number/10;

      }
      System.out.print(revNumber);

    }
}
    

