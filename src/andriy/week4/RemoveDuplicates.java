package andriy.week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    //First approach
    public static String removeDuplicate2(String str) {

        str = str.replace(" ", "").trim();

        // splits modified string to Array then convert to ArrayList and finally created LinkedHashSet from ArrayList to remove duplicates
        Set<String> list = new LinkedHashSet<>(Arrays.asList(str.split("")));

        //Concatenate the unique characters from LinkedHashSet back in to String
        str = String.join("", list);

        return str;
    }

    // Second approach
    public static String removeDuplicates(String str) {

        str = str.replace(" ", "").trim();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String str = "aaaaaannnnnyyyyyttttt";

        System.out.println(removeDuplicates(str));

        String str2 = "aaaddddtttttnnnn";

        System.out.println(removeDuplicate2(str2));
    }
}
/*
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

 */