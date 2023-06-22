package andriy.week6;

import java.util.Arrays;

public class SumOfAllDigits {

    public static int sumOfAllDigits(String str) {
        int sumofDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sumofDigits += Integer.parseInt(str.charAt(i)+"");
            }
        }
        return sumofDigits;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllDigits("12 java 5 apple 3"));
    }
}
/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */