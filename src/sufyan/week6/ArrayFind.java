package sufyan.week6;

import java.util.Arrays;

public class ArrayFind {
   // Array_FindMaximum
    //Write a method that can find the maximum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        Arrays.sort(arr);
        System.out.println("\"the bigest number is \" + arr[arr.length - 1] = " + "the bigest number is " + arr[arr.length - 1]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

    }


}
