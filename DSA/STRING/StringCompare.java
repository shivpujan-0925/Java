public class StringCompare {
    public static void main(String[] args) {
        String s1 = "stark";
        String s2 = "stark";
        String s3 = new String("stark");

        // if(s1 == s2){
        //     System.out.println("string are Equals");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("string are Equals");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        //String compare functions - 
        if(s1.equals(s3)){
            System.out.println("Strings are Equal");
        }else {
            System.out.println("String are not equal");
        }
    }
}
