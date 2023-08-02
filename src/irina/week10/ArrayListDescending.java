package irina.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDescending {
    //ArrayList - sorting in descending order
//Write a method that can sort the ArrayList in Descending order without using the sort method.
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 50, 5, 2, 15));

        System.out.println("orderAscending(nums) = " + orderDescending(nums));

    }

    public static ArrayList<Integer> orderDescending(ArrayList<Integer> list_of_integers) {
        int temp = 0;
        for (int i = 0; i < list_of_integers.size(); i++) {
            for (int j = 0; j < list_of_integers.size(); j++) {
                if (list_of_integers.get(i) > list_of_integers.get(j)) {
                    temp = list_of_integers.get(i);
                    list_of_integers.set(i, list_of_integers.get(j));
                    list_of_integers.set(j, temp);



                }
            }
        }

        return list_of_integers;

    }
}




