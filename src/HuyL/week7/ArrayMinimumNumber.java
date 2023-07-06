package HuyL.week7;

import java.util.Arrays;

public class ArrayMinimumNumber {

    public static void main(String[] args) {

        int[] nums = {2,6,9,1,8,3,3};

        System.out.println(minimumNumber(nums));
    }

    public static int minimumNumber(int[] nums){

        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}
/*
Write a method that can find the minimum number from an int Array

 */
