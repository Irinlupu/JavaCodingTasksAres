package sufyan.week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameLetters {

    public static void main(String[] args) {
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:
        System.out.println("sameL(\"aeufisno\" , \"soufiane\") = " + sameL("aeufisno", "soufiane"));



    }

    public static boolean sameL(String str , String name){
        boolean flag = true;
        List<String> letters = Arrays.asList(str.split(""));
        for (int i = 0; i < letters.size() - 1; i++) {
            if (!name.contains(letters.get(i))) {
                flag = false;
                break;
            }
        }


        return flag;
    }
}
