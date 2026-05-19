
public class StringDuplicate {
    public static void removeDuplicate(String str, int idx, StringBuilder newString, boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        // working
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){    //check duplicate
            removeDuplicate(str, idx+1, newString, map);
        }else {
            map[currChar - 'a'] = true;    //asign true 
            removeDuplicate(str, idx+1, newString.append(currChar), map);
        }


    }
    public static void main(String[] args) {
        String str = "inddianaa";
        StringBuilder newStr = new StringBuilder("");
        boolean map[] = new boolean[26];

        removeDuplicate(str, 0, newStr, map);
    }
}
