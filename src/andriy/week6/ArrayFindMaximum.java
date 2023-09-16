package andriy.week6;

import java.util.Scanner;

public class ArrayFindMaximum {

    public static int maxNumberOfArray(int[] array){

        int maxNumber = array[0];
       // int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
           if (array[i]>maxNumber){
               maxNumber=array[i];
           }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int [] array = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("maxNumberOfArray =  " + maxNumberOfArray(array));
    }
}
/*
Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */