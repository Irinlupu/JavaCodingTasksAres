package Aleksandar.Week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println(numList);

       ArrayList<Integer> newList = new ArrayList<>();

        for (Integer eachNum : numList) {
           if (eachNum <= 100){
               newList.add(eachNum);
           }
        }
        System.out.println("newList = " + newList);
    }
}
/*
List_RemoveSomeValues
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc.
remove all values greater than 100.
 */
