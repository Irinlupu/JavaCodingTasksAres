package Aleksandar.Week9;

import java.util.Arrays;

public class Concat2Arrays {

    public static int[] NewArray (int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];
        int size = 0;

        for (int i = 0; i < arr1.length; i++, size++) {
            arr3[size] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,size++) {
            arr3[size] = arr2[i];
        }

        return arr3;
    }

    public static void main(String[] args) {

        int[] num1 = {3,6,8};
        int[] num2 = {7,80,99};

        System.out.println(Arrays.toString(NewArray(num1,num2)));


    }

}
/*
Array_concat2Arrays
Write a return method that can concatenate two arrays
 */