package irina.week10;

import java.util.*;

public class MapSorted {
    //Map - Sort the map by values
//Write a method that can sort the Map by values.

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple",5);
        map.put("Oranges",10);
        map.put("Strawberries", 2);
        System.out.println("sortMapByValue(map) = " + sortMapByValue(map));
    }


    public static Map<String, Integer> sortMapByValue(Map<String, Integer> map){

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> eachEntry : list) {
            map.put(eachEntry.getKey(), eachEntry.getValue());
        }



        return map;
    }

}
