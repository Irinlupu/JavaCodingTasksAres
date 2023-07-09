package sufyan.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    //Question 3: Array - Move Zeros to the End
    //Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input: {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void main(String[] args) {
        int[] arr =  {1,0,2,0,3,0,4,0};

        int[] newarray = new int[arr.length];

        ArrayList<Integer> arry = new ArrayList<>();



        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                arry.add(arr[i]);
            }
        }
        for (int i = 0; i < arry.size(); i++) {
            newarray[i] = arry.get(i);
        }

        for (int i = 0; i < newarray.length; i++) {
            System.out.println("newarray[i] = " + newarray[i]);
        }

    }
}
