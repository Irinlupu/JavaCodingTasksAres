package Yared;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {0,0,1,2,5,};


    }




    public void moveZeroToEnd(int[] a){

        int j =0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                a[j++] = a[i];

                while (j < a.length){
                    a[i++] =0;


                }

            }


        }


    }
}
