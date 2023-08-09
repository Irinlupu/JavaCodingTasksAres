package Aleksandar.Week11;

import java.util.HashMap;
import java.util.Map;

public class Map_Frequency_of_Characters {

    public static void main(String[] args) {
        Map<Character, Integer> mapList = new HashMap<Character, Integer>();
        String str = "aalleeekksandddar";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer val = mapList.get(ch);
            if (val != null) {
                mapList.put(ch, val + 1);
            }
            else {
                mapList.put(ch, 1);
            }
        }

        System.out.println("mapList = " + mapList);


    }


}

//Write a method that prints the frequency of each character from a String.