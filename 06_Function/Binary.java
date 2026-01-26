public class Binary {
      //Binary to decimal

      public static int binaryToDec(int binaryNum){
      int myBinNumber = binaryNum;
       int decimalNumber = 0;

       for(int power = 0; binaryNum >=1; power++ ){
              int lastDigit = binaryNum % 10;
              decimalNumber = decimalNumber + (lastDigit * (int)mathFunction.pow(2, power));
              binaryNum = binaryNum / 10;
             
       }
        System.out.println("Decimal form of "+ myBinNumber+ "=" + decimalNumber);
         return decimalNumber;
        
      }



   //Decimal to binary:

      public static int DecToBinary(int num){
         int decimalNumber = num;
         int binaryNum = 0;

         for(int pow = 0; num >=1; pow++){
          int remainder = num % 2;
          binaryNum = binaryNum + remainder * (int)mathFunction.pow(10, pow);
          num = num / 2; 
        
         }
         //   System.out.print(binaryNum);  
        System.out.println("Binary form of "+ decimalNumber+ " : " + binaryNum);
         return binaryNum;
      }
       public static void main(String args[]){
         //  binaryToDec(1010001011);
          DecToBinary(10);
       }
}
