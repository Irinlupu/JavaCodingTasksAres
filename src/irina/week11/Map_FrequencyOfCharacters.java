package irina.week11;

import java.util.*;

public class Map_FrequencyOfCharacters {

    //    Map_Frequency of Characters
    //Write a method that prints the frequency of each character from a String.



    public static void main(String[] args) {

        String word = "aaabcccddzzz";
        System.out.println("mapFrequencyOfCharacters(word) = " + mapFrequencyOfCharacters(word));

    }


    public static Map<String, Integer> mapFrequencyOfCharacters( String word) {

        Map<String, Integer> frequencyOfCharacters = new LinkedHashMap<>();

        String [] arrayOfCharacters = word.split("");

        for (String eachCharacter : arrayOfCharacters) {
            int frequency = Collections.frequency(List.of(arrayOfCharacters), eachCharacter);
            frequencyOfCharacters.put(eachCharacter, frequency);
        }










        return frequencyOfCharacters;
    }
}
