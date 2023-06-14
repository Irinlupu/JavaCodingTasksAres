package sufyan.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC
        System.out.println("removeduplcate(\"Sooufianee\") = " + removeduplcate("Sooufianee"));

    }

    public static String removeduplcate(String word){
        String copy = "";
        Set<String> nonDuplicate = new LinkedHashSet<>(Arrays.asList(word.split("")));
        for (String each : nonDuplicate ) {
            copy += each;
        }

     return copy;
    }
}
