package HuyL.week8;

import java.util.Arrays;

public class ArrayMoveZeroToTheEnd {

    public static void main(String[] args) {

        int[] nums = {0,5,0,4,0,2,3,0,7,9,2};

        System.out.println(Arrays.toString(moveZeroToTheEnd(nums)));
        //output: [5, 4, 2, 3, 7, 9, 2, 0, 0, 0, 0]
    }

    public static int[] moveZeroToTheEnd(int[] nums){

        int[] newArray = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                newArray[count++] = nums[i];
            }
        }

        return newArray;
    }
}
/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
