package andriy.week10;

import java.util.*;

public class MapSortByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Mehmet", 200000);
        map.put("Yared", 180000);
        map.put("Henry", 150000);
        map.put("Irina", 190000);
        map.put("Natalia", 160000);
        map.put("Alex", 140000);
        map.put("Laila", 210000);
        map.put("Andriy", 130000);
        map.put("Syfyan", 210000);

        System.out.println(sortingMap(map));

    }


    public static Map<String, Integer> sortingMap(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> eachEntry : list) {
            map.put(eachEntry.getKey(), eachEntry.getValue());
        }

        return map;
    }
}
/*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */