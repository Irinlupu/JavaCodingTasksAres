package irina.week4;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    /*
    String -- Same letters
        Write a return method that check if a string is build out of the same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:

     */

    public static void main(String[] args) {

        String str1 = "abbc";
        String str2 = "bbca";

        System.out.println(sameLetters(str1, str2));


    }

    public static boolean sameLetters(String str1, String str2) {




        char [] string1 = str1.toLowerCase().toCharArray();
        char [] string2 = str2.toLowerCase().toCharArray();

        Arrays.sort(string1);
        str1 = new String(string1);
        System.out.println(str1);

        Arrays.sort(string2);
        str2 = new String(string2);
        System.out.println(str2);


        return (str1.equals(str2));


    }

}
