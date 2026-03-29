public class Substring {
    public static String substring(String str, int si, int ei){
        //si-> starting index, ei-> ending index.
        String substr = "";
        for(int i = si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Helloworld";
        // System.out.println(substring(str, 0, 5));

        //inbuilt  function to get substring
        String subString =  str.substring(0, 5);
        System.out.println(subString);



    }
}
