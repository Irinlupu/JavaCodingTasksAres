package andriy.week7;

import java.util.Arrays;

public class ArraySortDescending {

    public static int[] array_sort_descending(int[] num) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(array_sort_descending(arr)));
    }
}
/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */