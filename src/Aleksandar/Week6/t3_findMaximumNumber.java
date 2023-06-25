package Aleksandar.Week6;

public class t3_findMaximumNumber {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6, 160, 355};

        int maxNum = -2147483648;

        for (int each : arr) {
            if (each > maxNum){
                maxNum = each;
            }
        }
        System.out.println(maxNum);

    }

}
/*
Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
