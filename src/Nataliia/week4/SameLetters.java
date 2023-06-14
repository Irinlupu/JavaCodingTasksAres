package nataliia.week4;

import java.util.Arrays;

public class SameLetters {
    /*String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/
    public static boolean SameLetters(String str1, String str2){
        char [] charArray1 = str1.toLowerCase().toCharArray();
        char [] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        str1 = new String (charArray1);
        str2 = new String (charArray2);
        return str1.equals(str2);
    }



    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "dcba";

        System.out.println("" + str1 + " is " + SameLetters(str1, str2) + " " + str2 );


    }
}
