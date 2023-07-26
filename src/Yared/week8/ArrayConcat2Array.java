package Yared.week8;

import java.util.Arrays;

public class ArrayConcat2Array {

    public static void main(String[] args) {

        int[] arr1 ={1,2,3,4};
        int[] arr2 ={5,6,7,8};

        int lengthArray1 = arr1.length;
        int lengthArray2 = arr2.length;

        int result  [] = new int[lengthArray1 + lengthArray2];

        System.arraycopy(arr1,0,result,0,lengthArray1);
        System.arraycopy(arr2,0,result,lengthArray1,lengthArray2);

        System.out.println(Arrays.toString(result));

    }
}
