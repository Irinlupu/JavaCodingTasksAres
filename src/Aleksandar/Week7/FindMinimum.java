package Aleksandar.Week7;

public class FindMinimum {
    //Question1: Array - Find Minimum
    //Write a method that can find the minimum number from an int Array

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 78, 999};

        int min = 2147483647;
        int min2 = Integer.MAX_VALUE;

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        System.out.println(min);


    }
}
