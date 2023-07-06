package HuyL.week7;

import java.util.Arrays;

public class ArraySortAscending {

    public static void main(String[] args) {

        int[] arr={12,50,41,29,90,6,70,1};

        System.out.println(Arrays.toString(arraySortAscending(arr)));
    }

    public static int[] arraySortAscending(int[] nums){

        //int sortAscending = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]> nums[j]){
                    int tempNums = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tempNums;
                }
            }
        }
        return nums;
    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};


 */
