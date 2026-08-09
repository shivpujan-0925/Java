public class StringLength {
    public static int Length(String str){
        //base case
        if(str.length() == 0){
            return 0;
        }else{
            return 1 + Length(str.substring(1)); //recursive call with substring 
        }
    }
    public static void main(String[] args) {
        System.out.println(Length("radhe"));
    }
}
