package irina.week8;

import java.util.Arrays;

public class ZeroesToEndArray {

    /*Question 3: Array - Move Zeros to the End
        Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
        Ex:
        input: {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]

*/
    public static void main(String[] args) {
        int[] numbers = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(zeroesToEnd(numbers)));

    }

    public static int[] zeroesToEnd(int[] nums) {


        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < nums.length)
            nums[count++] = 0;


        return nums;
    }




}
