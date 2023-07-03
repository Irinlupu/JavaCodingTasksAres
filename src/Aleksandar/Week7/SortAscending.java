package Aleksandar.Week7;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr={10,8,9,7};
        System.out.println(Arrays.toString(arr));
        int num;


        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    num = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=num;
                }
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order
without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
