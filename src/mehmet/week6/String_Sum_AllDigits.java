package mehmet.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_Sum_AllDigits {


    //1️⃣  String_SumOfAllDigits
    //Write a method that can return the sum of the digits in a string
    //Ex:  "12 java 5 apple 3"  ==>  20

    public static void main(String[] args) {
        System.out.println("sumAllDigits(\"12 java 5 apple 3\") = " + sumAllDigits("12 java 5 apple 3"));
    }



    public static int sumAllDigits(String str) {

        int total = 0;

        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));


        for (String s : list) {

            try {
                total += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isDigit(s.charAt(i))) {
                        total += Integer.parseInt(s.charAt(i) + "");
                    }
                }
            }

        }

        return total;

    }

}
