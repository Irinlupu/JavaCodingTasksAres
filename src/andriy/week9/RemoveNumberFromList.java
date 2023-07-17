package andriy.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumberFromList {

    public static List<Integer> removeNum(List<Integer> list, int num) {
        list.removeIf(p -> p >= num);
        return list;
    }

    public static List<Integer> removeNum2(List<Integer> list, int num){

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer eachNum = it.next();
            if (eachNum>=num){
                it.remove();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println(removeNum(list, 100));
        System.out.println(removeNum2(list, 100));
    }
}


/*
List_RemoveSomeValues
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
 */