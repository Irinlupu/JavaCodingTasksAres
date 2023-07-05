package Yared.wee7;

import java.util.Arrays;

public class AscendingSortArray {
    public static void main(String[] args) {


        int array[] = new int[] {10,8,4,3,1};

        int result;

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    result= array[i];
                    array[i]=array[j];
                    array[j] = result;
                }
            }


        }
        System.out.println(Arrays.toString(array));
    }
}
