package mehmet.week7;

import java.util.Arrays;

public class SortDescending {

    //3️⃣Question3: Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }

    public static int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int biggestValue = arr[i];
                int followingValue = arr[j];
                int holder = 0;

                if (biggestValue < followingValue){

                    holder = biggestValue;
                    arr[i] = followingValue;
                    arr[j] = holder;

                }

            }
        }
        return arr;
    }
}
