package andriy.week7;

import laila.week3.num;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortAscending {

    /*
    public static int[] array_sort_ascending(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : num) {
            list.add(each);
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = minNum(list);
            list.remove(Integer.valueOf(num[i]));
        }
        return num;
    }
    public static int minNum(ArrayList<Integer> num) {
        int min = Integer.MAX_VALUE;
        for (int eachNum : num) {
            min = Math.min(min, eachNum);
        }
        return min;
    }
*/
    public static void main(String[] args) {

        int[] arr = {7, 9, 8, 7};
        System.out.println(Arrays.toString(array_sort_ascending((arr))));
    }

    public static int[] array_sort_ascending(int[] num) {
//
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }
}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */