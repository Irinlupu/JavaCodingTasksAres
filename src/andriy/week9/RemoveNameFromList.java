package andriy.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNameFromList {

    public static List<String> remove_name(List<String> list, String name) {
        list.removeIf(p -> p.equals(name));
        return list;
    }

    public static List<String> remove_name2(List<String> list, String name) {

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String each  = it.next();
            if (each.equals(name)){
                it.remove();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        String name = "Ahmed";
        System.out.println(remove_name(list, name));
        System.out.println(remove_name2(list, name));
    }
}
/*
 List_RemoveNameAhmed
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
 */