package sufyan.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfAllNum {


    //
    //
    //3️⃣ Array_FindMaximum
    //Write a method that can find the maximum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

    public static void main(String[] args) {
        //String_SumOfAllDigits
        //Write a method that can return the sum of the digits in a string
        //Ex:  "12 java 5 apple 3"  ==>  20
        String str = "12 java 5 apple 3";
        List<String> listofstr = Arrays.asList(str.split(" "));
        List<Integer> num = new ArrayList<>();
        int sumOfnum = 0;
        System.out.println("listofstr = " + listofstr);
        for ( String each : listofstr ) {
            try {
                num.add(Integer.valueOf(each));
            }catch (Exception e){

            }


        }
        System.out.println("num = " + num.toString());
        for (Integer eachInt : num ) {
            sumOfnum += eachInt;

        }
        System.out.println("sumOfnum = " + sumOfnum);


    }
}
