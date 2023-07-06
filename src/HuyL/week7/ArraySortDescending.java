package HuyL.week7;

import java.util.Arrays;

public class ArraySortDescending {

    public static void main(String[] args) {

        int[] arr={12,50,41,29,90,6,70,1};

        System.out.println(Arrays.toString(arraySortDescending(arr)));
    }

    public static int[] arraySortDescending(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] < nums[j]){
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
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
