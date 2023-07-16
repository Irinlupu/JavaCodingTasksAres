package irina.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemoveAhmed {
    //List_RemoveNameAhmed
    //Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    //Write a java operation to remove all the names named Ahmed
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        System.out.println(nameList);
        System.out.println("removeName(nameList) = " + removeName(nameList));

    }

    public static List<String> removeName(List<String> listOfNames){

        listOfNames.removeIf(p -> p.equals("Ahmed"));



        return listOfNames;


    }
}
