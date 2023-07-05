package mehmet.week6;

import java.util.*;

public class ArrayFindMaximum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 30, 31, 5, 6};
        System.out.println("findMaximumValue(arr) = " + findMaximumValue(arr));
    }

    public static int findMaximumValue(int arr[]) {
        int maxValue = arr[0];

        for (int element : arr) {
            if (maxValue < element) {
                maxValue = element;
            }
        }

        return maxValue;

       /* OptionalInt max =  Arrays.stream(arr).max();
        return max;*/
    }
}
