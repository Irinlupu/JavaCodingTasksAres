package Aleksandar.Week6;

import java.util.ArrayList;
import java.util.List;

public class T1_sumOfAllDigits {

    public static void main(String[] args) {

        String str ="12 java 5 apple 3 6";

        ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));

        int totalSum =0;
        String str2 ="";

        for (String eachArrStr : list) {
            String eachArrDigit = "";
            //System.out.println(Arrays.toString(eachArrStr.toCharArray()));

            for (int i = 0; i < eachArrStr.length(); i++) {
                Character each = eachArrStr.charAt(i);
                //System.out.println(each);
                if (Character.isDigit(each)) {
                    eachArrDigit += each;
                }
            }
            str2 += eachArrDigit + " ";
        }
        System.out.println(str2);

            String[] each = str2.split(" ");
            for (String eachNum : each) {
                if (eachNum.equals("")){
                    continue;
                }
                totalSum +=Integer.parseInt(eachNum);
            }

        System.out.println(totalSum);


        }

    }


/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */
