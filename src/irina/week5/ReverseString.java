package irina.week5;

public class ReverseString {

    /*
            String -- Reverse
         Write a function that can reverse String
         Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));
    }


    public static String reverseString(String str){
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            newStr+= str.charAt(i);
        }
        return  newStr;

    }
}
