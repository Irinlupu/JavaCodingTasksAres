package andriy.week9;

import java.util.Arrays;

public class Concat2Arrays {

    public static int[] concat_two_arrays(int[] list1, int[] list2) {

        int[] concatArray = new int[list1.length + list2.length];
        int indexOfNewArray = 0;
        for (int i = 0; i < list1.length; i++) {
            concatArray[indexOfNewArray++] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            concatArray[indexOfNewArray++] = list2[i];
        }
        return concatArray;
    }

    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {6,7,8,9};

        System.out.println(Arrays.toString(concat_two_arrays(list1, list2)));
    }
}
/*
 Array_concat2Arrays
Write a return method that can concatenate two arrays
 */