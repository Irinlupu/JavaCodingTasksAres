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

        String str1 = "abca";
        String str2 = "caab";

        System.out.println("sameLetters2(str1, str2) = " + sameLetters2(str1, str2));

        //System.out.println(sameLetters(str1, str2));


    }

    public static boolean sameLetters2(String str1, String str2) {
        boolean sameLetters = true;

        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {


                for (int j = 0; j < str2.length(); j++) {
                    char each = str2.charAt(j);

                    if (!str1.contains(each + "" )) {
                        sameLetters = false;
                    }


                }

            }


        }

        return sameLetters;

    }

    /*public static boolean sameLetters(String str1, String str2) {




        char [] string1 = str1.toLowerCase().toCharArray();
        char [] string2 = str2.toLowerCase().toCharArray();

        Arrays.sort(string1);
        str1 = new String(string1);
        System.out.println(str1);

        Arrays.sort(string2);
        str2 = new String(string2);
        System.out.println(str2);


        return (str1.equals(str2));


    }*/

}
