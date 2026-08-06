
public class StringDuplicate {
    public static void removeDuplicate(String str, int idx, StringBuilder newString, boolean map[]){
         //base case
         if(idx == str.length()-1){
            System.out.println(newString);
            return;
         }
         //traverse the character of str. 
         char currChar = str.charAt(idx);

         if(map[currChar - 'a'] == true){        //check char already present in map or NOT.
            removeDuplicate(str, idx+1, newString, map);
         }else{
            map[currChar - 'a'] = true;   //if char not present in map then set true 
            removeDuplicate(str, idx+1, newString.append(currChar), map);   //calling removeDuplicate fun with append new char in newString
         }


    }
    public static void main(String[] args) {
      String str = "appnnacollege";
      int idx = 0;
      boolean map[] = new boolean[26];
      StringBuilder newString = new StringBuilder("");

      removeDuplicate(str, idx , newString, map);
    }
}
