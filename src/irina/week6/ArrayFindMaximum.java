package irina.week6;

public class ArrayFindMaximum {
    /*
    Array_FindMaximum
        Write a method that can find the maximum number from an int Array
        Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

     */
    public static void main(String[] args) {
        int[] arr = {99, 120, 23, 32, 44, 57, 6};
        System.out.println("maxArrayNumber(arr) = " + maxArrayNumber(arr));
    }

    public static int maxArrayNumber(int[] nums){
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }

        }

        return max;
    }
}
