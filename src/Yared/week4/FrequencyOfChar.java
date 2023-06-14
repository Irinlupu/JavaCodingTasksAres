package Yared.week4;

public class FrequencyOfChar {

    public static String frequency(String str) {


        String result = "";

        for (int j = 0; j < str.length(); j++) {// this will get each char
            int count = 0;                 //
            char ch = str.charAt(j);

            for (int i = 0; i < str.length(); i++) { // this will check if first char is in every single char
                if (str.charAt(i) == ch) {
                    count++;   // if the char is there it will count
                }
            }
            if (result.contains("" + ch)) { // if the char contains skip to avoid duplicate char
                continue;
            }
            result += ch;
            result += count;

        }


        return result;

    }
    }