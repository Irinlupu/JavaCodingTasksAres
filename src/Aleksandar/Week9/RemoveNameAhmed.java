package Aleksandar.Week9;

import java.util.ArrayList;

public class RemoveNameAhmed {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Aaron");

        System.out.println(names);

        ArrayList<String> withoutName = new ArrayList<>();

        for (String eachName : names) {
            if (eachName.equals("Ahmed")) {
                continue;
            }
            withoutName.add(eachName);
        }

        System.out.println(withoutName);
    }
}
/*
List_RemoveNameAhmed
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
 */