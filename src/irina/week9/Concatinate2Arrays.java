package irina.week9;

import java.util.Arrays;

public class Concatinate2Arrays {


//    Array_concat2Arrays
//    Write a return method that can concatenate two arrays

    public static void main(String[] args) {
        String[] arr1 = {"hello", "world", "meet", "wooden", "spoon"};
        String[] arr2 = {"nice", "to", "meet", "you", "java"};

        System.out.println("Arrays.toString(concat_two_arrays(arr1, arr2)) = " + Arrays.toString(concat_two_arrays(arr1, arr2)));

    }

    public static String[] concat_two_arrays(String[] firstArray, String[] secondArray) {

        String[] newArray = new String[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];


        }

        for (int i = 0; i < secondArray.length; i++) {
            newArray[firstArray.length+i] = secondArray[i];
        }


        return newArray;
    }

}
