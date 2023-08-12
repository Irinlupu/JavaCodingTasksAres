package andriy.week11;

import java.util.*;

public class Map_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "qqqeeerrrtttyyuui";
        System.out.println(frequencyOfCharsInTheStr(str));

    }

    public static Map<Character, Integer> frequencyOfCharsInTheStr(String str) {
        Map<Character, Integer> frequencyOfTheChars = new LinkedHashMap<>();

        for (String each: str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            frequencyOfTheChars.put(each.charAt(0),frequency);
        }
        return frequencyOfTheChars;
    }
}

/*
 Map_Frequency of Characters
Write a method that prints the frequency of each character from a String.
 */