package andriy.week11;

import java.util.HashMap;
import java.util.Map;

public class Map_MinValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mehmet", 200000);
        map.put("Yared", 180000);
        map.put("Henry", 150000);
        map.put("Irina", 190000);
        map.put("Natalia",160000);
        map.put("Alex",140000);
        map.put("Laila",210000);
        map.put("Andriy",120000);
        map.put("Syfyan",210000);

        System.out.println(map);
        int minSalary = minValueOfTheMap(map);
        System.out.println("minSalary = " + minSalary);

    }

    public static int minValueOfTheMap(Map<String, Integer> map) {
        int min = Integer.MAX_VALUE;
        for (Integer each : map.values()) {
            if (min > each) {
                min = each;
            }
        }
        return min;
    }
}
/*
 Map_Min value
Write a method that can return the minimum value from a map (DO NOT use sort method).
 */