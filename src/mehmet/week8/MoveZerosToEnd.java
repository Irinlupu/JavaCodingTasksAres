package mehmet.week8;

import java.util.ArrayList;

public class MoveZerosToEnd {


    //2️⃣ Question 3: Array - Move Zeros to the End
    //Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input: {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println("moveZerosToEnd(arr) = " + moveZerosToEnd(arr));
    }


    public static ArrayList<Integer> moveZerosToEnd(int[] arr) {

        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i : arr) {
            if (i != 0) {
                newArray.add(i);
            }
        }

        for (int i : arr) {
            if (i == 0) {
                newArray.add(i);
            }
        }
        return newArray;
    }
}
