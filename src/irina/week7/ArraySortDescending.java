package irina.week7;

import java.util.Arrays;

public class ArraySortDescending {

    /*
    Question3: Array - Sort Descending
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
            Ex: int[] arr = {10,20,7, 8, 90};
            arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90};
        System.out.println("Arrays.toString(arraySortDescending(arr)) = " + Arrays.toString(arraySortDescending(arr)));

    }

    public static int [] arraySortDescending(int [] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array [j] = temp;
                }

            }
        }

        return array;
    }

}
