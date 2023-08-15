package andriy.week11;

import java.util.*;

public class Map_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "qqqeeerrrtttyyuui";
        System.out.println(frequencyOfCharsInTheStr(str));

    }

    public static Map<String, Integer> frequencyOfCharsInTheStr(String str) {
        Map<String, Integer> frequencyOfTheChars = new HashMap<>();

        String[] strArr =  str.split("");
        for (String each: strArr) {
            int frequency = Collections.frequency(Arrays.asList(strArr),each);
            frequencyOfTheChars.put(each,frequency);
        }
        return frequencyOfTheChars;
    }
}

/*
 Map_Frequency of Characters
Write a method that prints the frequency of each character from a String.
 */