package mehmet.week7;

import java.util.Arrays;

public class FindMinimum {
    //1️⃣ Question1: Array - Find Minimum
    //Write a method that can find the minimum number from an int Array

    public static void main(String[] args) {
        System.out.println(findMinimum(new int[]{9, 34, 5, 6, 1}));
    }

    public static int findMinimum(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
