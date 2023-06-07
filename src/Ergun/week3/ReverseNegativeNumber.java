package Ergun.week3;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseNegativeNumber {

    /*

    Numbers -- Reverse negative number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53

    */

    public static void reverseNegativeNumber(int num){

        String convertedNum = String.valueOf(num);

        String reverse ="-";

        for (int i = convertedNum.length()-1; i > 0; i--) {
            reverse +=convertedNum.charAt(i);

        }
        Integer reversedNumber = Integer.valueOf(reverse);

        System.out.println(reversedNumber);

    }


    public static void main(String[] args) {

        reverseNegativeNumber(-3412);

    }
}
