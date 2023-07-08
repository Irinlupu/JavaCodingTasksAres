package andriy.week8;

import java.util.Arrays;

public class ArrayMoveZerosToEnd {

    public static int[] all_zeros_on_the_end(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j++] = arr[i];

            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(all_zeros_on_the_end(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
    }
}
/*
Question 3: Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */