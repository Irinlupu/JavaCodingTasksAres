package sufyan.week4;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        //Write a return method that can find the frequency of characters
        //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        String word = "Soufiaaaannnee!!!!!!";
        int count = 1;
        List<String> duplicate = new ArrayList<>(Arrays.asList(word.split("")));
        Map<String,Integer> arr = new HashMap<>();
        for (String ch: duplicate) {

            if (!arr.containsKey(ch)){
                arr.put(ch,count);
            }else {
                arr.put(ch,count++);
            }

        }

        System.out.println(arr);
    }
}
