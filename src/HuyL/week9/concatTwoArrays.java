package HuyL.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class concatTwoArrays {

    public static void main(String[] args) {

        int[] a1 = {1,2,3};
        int[] a2 = {4,5,6};

        System.out.println(Arrays.toString(concatTwoArrays(a1,a2)));


    }

    public static int[] concatTwoArrays(int[] nums1, int[] nums2){

        int[] combineTwoArrays = Arrays.copyOf(nums1, nums1.length + nums2.length);

        for (int i = 0, j = nums1.length; i < nums2.length; i++, j++) {

            combineTwoArrays[j] = nums2[i]; // to merge both arrays nums1 & nums2
        }

        return combineTwoArrays;

    }
}
/*
Write a return method that can concatenate two arrays
 */
