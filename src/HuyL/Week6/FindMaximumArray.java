package HuyL.Week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMaximumArray {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(maximumNumber(arr));
    }

    public static int maximumNumber(int[] nums){

       int maxNum = Integer.MIN_VALUE;

        for (int each : nums) {
            if (each > maxNum){
                maxNum = each;
            }
        }

        return maxNum;
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99


 */