package irina.week9;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemoveValues {
    //List_RemoveSomeValues
    //Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));
        System.out.println(listOfIntegers);
        System.out.println("removeInteger(listOfIntegers) = " + removeInteger(listOfIntegers));

    }

    public static List<Integer> removeInteger(List<Integer> integerList){

        integerList.removeIf(p-> p > 100);

        return integerList;

    }

}
