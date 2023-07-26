package mehmet.week9;

import java.util.Arrays;

public class Concat2Arrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {

        int newArraySize = arr1.length + arr2.length;
        int secondArraysCounter = 0;

        int[] newArray = new int[newArraySize];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }


        for (int i = arr1.length; i < newArraySize; i++) {
            newArray[i] = arr2[secondArraysCounter];
            secondArraysCounter++;
        }

        return newArray;
    }
}
