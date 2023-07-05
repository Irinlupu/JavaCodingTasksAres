package irina.week7;

public class ArrayFindMinimum {

    /*
    Question1: Array - Find Minimum
        Write a method that can find the minimum number from an int Array
     */

    public static void main(String[] args) {

        int[] nums = {15, 2, 25, -4, 133};
        System.out.println("arrayMinimum(nums) = " + arrayMinimum(nums));

    }

    public static int arrayMinimum(int [] numbers){
        int minNumber = numbers[0];

        for(int i= 1; i < numbers.length; i++){
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
        }


        return minNumber;
    }


}
