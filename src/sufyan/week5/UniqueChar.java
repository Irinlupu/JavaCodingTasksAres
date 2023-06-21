package sufyan.week5;

import com.sun.tools.javac.Main;

import java.util.*;

public class UniqueChar {
    //➡️ String - Find the unique
    // Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println("uniqueChars(str) = " + uniqueChars(str));


    }



    public static StringBuilder uniqueChars(String str){
        StringBuilder setOfChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count==1){
                setOfChars.append(str.charAt(i));
            }
        }
        return setOfChars;
    }
}
