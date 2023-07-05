package irina.week7;

import java.util.Arrays;

public class ArraySortAscending {
    /*
    Question2: Array - Sort Ascending
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
            Ex: int[] arr = {10, 9, 8, 7};
            arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        System.out.println("sortArray(arr) = " + sortArrayAscending(arr));
        System.out.println(Arrays.toString(sortArrayAscending(arr)));
    }

    public static int[] sortArrayAscending(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }


        return array;
    }
}
