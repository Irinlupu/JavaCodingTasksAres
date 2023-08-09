package Aleksandar.Week11;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_Min_value {

    public static void main(String[] args) {

        Map<String, Integer> daysInWeek = new HashMap<>();


        daysInWeek.put("Monday", 1);
        daysInWeek.put("Tuesday", 2);
        daysInWeek.put("Wednesday", 3);
        daysInWeek.put("Thursday", 4);
        daysInWeek.put("Friday", 5);
        daysInWeek.put("Saturday", 6);
        daysInWeek.put("Sunday", 7);


        daysInWeek.forEach((key, value) ->
                System.out.println("Key : " + key + "    " + "Value : " + value));

        int min = Collections.min(daysInWeek.values());

        System.out.println("min value = " + min);

    }


}

//Write a method that can return the minimum value from a map (DO NOT use sort method).