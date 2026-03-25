import java.util.*;
public class Strings {
   
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c'};
       
    //Declaration of String -
        String str = "abcd";
        String str2 = new String("radhe");

    //Taking input as string -
    Scanner scn = new Scanner(System.in);

    //    String name;
    // //    name = scn.next();    => its takes only first word
    //   name = scn.nextLine();   // takes lines of word
    //    System.out.println( name);

// Length of String - 

    // String fullName = "arya stark";
    // System.out.println(fullName.length());  // print length including space between word
    

//CONCATENATION => ADD STRINGS
    String firstName = "jon";
    String lastName = "snow";
    String fullName = firstName + " " + lastName;
     
    // System.out.println(fullName);

    printLetters(fullName);

    }
}
