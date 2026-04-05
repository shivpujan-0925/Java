import java.util.Arrays;

public class Anagram {
     public static void anaGram(String str1, String str2){
       //convert strings into lowerCase
       str1 = str1.toLowerCase();
      str2 =  str2.toLowerCase();

       //checking both string length
       if(str1.length() == str2.length()){
            char[] str1charArr = str1.toCharArray();
            char[] str2charArr = str2.toCharArray();
             
            Arrays.sort(str1charArr);
            Arrays.sort(str2charArr);


           boolean result = Arrays.equals(str1charArr, str2charArr);

           if(result){
             System.out.println(str1 + " and " + str2 + " both are anagram to each other");
           }else {
             System.out.println(str1 + " and " + str2 + " both are NOT anagram to each other");
           }


       }else{
          System.out.println(str1 + " and " + str2 + " both are  NOT anagram to each other");
       }
     }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "hEart";
        anaGram(str1, str2);
    }
}