package andriy.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortDesc {
    public static ArrayList<Integer> descOrderWithoutSortMethod(ArrayList<Integer>intArray){

        for (int i = 0; i < intArray.size(); i++) {
            for (int j = 0; j < intArray.size(); j++) {
                if (intArray.get(i)>intArray.get(j)){
                    int temp = 0;
                    temp=intArray.get(i);
                    intArray.set(i,intArray.get(j));
                    intArray.set(j, temp);
                }
            }

        }
        return intArray;
    }


    public static void main(String[] args) {
        ArrayList<Integer>intArray = new ArrayList<>(Arrays.asList(4,2,1,7,9,5,8));
        System.out.println(descOrderWithoutSortMethod(intArray));
    }

}
/*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in Descending order without using the sort method.
 */