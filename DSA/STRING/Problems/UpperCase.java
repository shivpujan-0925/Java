package Problems;

public class UpperCase {

    public static String toUpperCase(String str){

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i =1; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();      //Use 'toString() method to convert StringBuilder to string

    }
    public static void main(String[] args) {
        String str = "hi, i am radhe";
       System.out.println( toUpperCase(str));
    }
}
