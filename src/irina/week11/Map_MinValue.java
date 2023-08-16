package irina.week11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_MinValue {

    public static void main(String[] args) {
        Map<String, Integer> booksPages = new LinkedHashMap<>();

        booksPages.put("Never Split The Difference", 455);
        booksPages.put("Dare to Lead", 345);
        booksPages.put("Genius Life", 410);
        booksPages.put("Genius Kitchen", 210);
        booksPages.put("Genius Foods", 401);
        booksPages.put("Atlas of the Heart", 555);

        System.out.println("minValue(booksPages) = " + minValue(booksPages));
    }


        //      Map_Min value
        //Write a method that can return the minimum value from a map (DO NOT use sort method).

    public static int minValue(Map<String, Integer> bookPages){

      int minValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> eachEntry : bookPages.entrySet()) {

            if(eachEntry.getValue()<minValue){
                minValue = eachEntry.getValue();
            }

        }
        return minValue;

    }
}
