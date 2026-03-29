package Concepts;

public class StringBuild {
   public static void main(String[] args) {
    //StringBuilder function
    StringBuilder sb = new StringBuilder("");
     for(char ch='a'; ch<='z'; ch++){
        sb.append(ch);
     }
     System.out.println( sb);
   }
}
