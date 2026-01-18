//PATTERN

// How to tackle pattern problem:
//step-01: for Lines ==> ( Use outer Loop)
//step-02: for number of times character etc. ==> ( Use inner Loop (i)) -> i times
//step-03: what to print. ex=> "*"

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


public class Part01 {
   public static void main(String args[]) {

      // for (int line = 1; line <=4; line++) {
      //    for (int star = 1; star <= line ; star++) {
      //       System.out.print("*");
      //    }
      //    System.out.println();

      // }


      //for inverted star pattern

      // for(int line = 1; line <= 4; line++){
      //    for(int star= 4; star>= line; star--){
      //        System.out.print("*");
      //    }
      //    System.out.println();
      // }
      
      //OR


      // int n = 4;
      // for(int line = 1; line<=n; line++){
      //    for(int star = 1; star <= n-line + 1; star++){
      //          System.out.print("*");
      //    }
      //    System.out.println();
      // }
      

      //  print Half-pyramid Pattern:

      // for( int line =1; line <= 4; line++){
      //    for(int num=1; num<=line; num++){
      //        System.out.print(num);
      //    }
      //    System.out.println();
      // }



      // Print Character Pattern:

      // int n = 4;
      // char ch = 'A';
      // for(int line = 1; line<=n; line++){
      //    for(int chars= 1; chars<=line; chars++){
      //       System.out.print(ch);
      //       ch++;
      //    }
      //    System.out.println();
      // }
   }
}
