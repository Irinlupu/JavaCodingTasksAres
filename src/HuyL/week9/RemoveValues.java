package HuyL.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValues {

    public static void main(String[] args) {

        ArrayList<Integer> listNumsWithoutGreaterThan100 = new ArrayList<>();

        listNumsWithoutGreaterThan100.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300, 400, 7, 8, 9, 10, 130, 520, 8000));

        listNumsWithoutGreaterThan100.removeIf(p -> p >= 100);

        System.out.println(listNumsWithoutGreaterThan100);
    }
}
/*
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
 */
