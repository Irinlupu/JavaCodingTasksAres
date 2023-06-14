package andriy.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {


    public static String charFrequency(String str) {

        str = str.replace(" ", "").trim();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (!newStr.contains(ch + "")) {
                newStr += "" + ch + count;
            }
        }
        return newStr;
    }


    public static void main(String[] args) {

        String str = "AAABBBBCCDDDDD";

        System.out.println(charFrequency(str));

    }

}
/*
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */