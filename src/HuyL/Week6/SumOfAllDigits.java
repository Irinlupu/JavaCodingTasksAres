package HuyL.Week6;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllDigits {

    public static void main(String[] args) {

        System.out.println("Sum of digits = " + sumOfDigits("12 java 5 apple 3"));
    }

    public static int sumOfDigits(String str){

        int sumAllDigits = 0;
        String str2 = "";
        String[] strOfArray = str.split(" ");

        for (String each : strOfArray) {

            String strOfNums = "";

            for (int i = 0; i < each.length(); i++) {
                if (Character.isDigit(each.charAt(i))){
                    strOfNums += each.charAt(i);
                }
            }

            str2 += strOfNums+" ";

        }

        for (String each2 : str2.split(" ")) {
            if (each2.equals("")) {
                continue;
            }
            sumAllDigits += Integer.parseInt(each2);
        }

        return sumAllDigits;

    }
}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20

 */