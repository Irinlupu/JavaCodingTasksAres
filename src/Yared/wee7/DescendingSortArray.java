package Yared.wee7;

import java.util.Arrays;

public class DescendingSortArray {

    public static void main(String[] args) {

        int arr[] = new int[]{14, 5, 6, 1};

        int result;

        for (int i = 0; i < arr.length; i++) {


            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    result = arr[i];
                    arr[i] = arr[j];
                    arr[j] = result;
                }
            }


        }
        System.out.println(Arrays.toString(arr));

    }

}