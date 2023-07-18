package HuyL.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAhmed {

    public static void main(String[] args) {

        ArrayList<String> listNamesWithoutAhmed = new ArrayList<>();
        listNamesWithoutAhmed.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron", "Andrew", "Kelly"));

        listNamesWithoutAhmed.removeIf(p -> p.contains("Ahmed"));

        System.out.println(listNamesWithoutAhmed);
    }

}
/*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed

 */
