package mehmet.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAsc {

    
    /*
    1️⃣  ArrayList - sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using the sort method.
    */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5,2,8,1,3));
        System.out.println("Original List: " + numbers);
        sortAscending(numbers);
        System.out.println("Sorted List: " + numbers +
                "\n-------------------------------------------------------------------------------");

        List<String> words = new ArrayList<>(Arrays.asList("Muhtar","Saim","Bryan","Gurhan","Mehmet"));
        System.out.println("Original List: " + words);
        sortAscending(words);
        System.out.println("Sorted List: " + words);

        System.out.println("---------Original-----------");

        System.out.println("sortAscendingInt(numbers) = " + sortAscendingInt(numbers));
    }


    public static<T extends Comparable<T>> List<T> sortAscending(List<T> list){

        T tempValue ;

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i).compareTo(list.get(j)) < 0){
                    tempValue = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tempValue);
                }
            }
        }

        return list;
    }

    public static List<Integer> sortAscendingInt(List<Integer> list){

        int tempValue;
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)){
                    tempValue = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tempValue);
                }
            }
        }

        return list;
    }

}
