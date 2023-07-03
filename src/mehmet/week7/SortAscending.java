package mehmet.week7;

import java.util.Arrays;

public class SortAscending {

    //2️⃣ Question2: Array - Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = Sort(arr); ==>{ 7, 8, 9, 10};

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 0};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }

    public static int[] sortAscending(int[] arr){


        for (int i = 0; i < arr.length -1 ; i++){
            for (int j = i+1; j< arr.length; j++){

                int biggestValue = arr[i];
                int followingValue = arr[j];
                int holder = 0;

                if (biggestValue > followingValue){
                    holder = biggestValue;
                    arr[i] = followingValue;
                    arr[j] = holder;
                }

            }
        }

        return arr;

    }


}
