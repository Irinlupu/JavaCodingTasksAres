package irina.week6;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllDigits {
    /*
    String_SumOfAllDigits
        Write a method that can return the sum of the digits in a string
        Ex:  "12 java 5 apple 3"  ==>  20

     */

    public static void main(String[] args) {
        String str = "125 java 5 apple 3";
        System.out.println("sumOfAllDigits(str) = " + sumOfAllDigits(str));


    }

    public static int sumOfAllDigits(String str) {
        // initializing the sum variable that will be returned by the method at the end
        int sum = 0;
        // converting the string into a char array and adding it to an ArrayList<String> type.
        ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));
        // initializing a new String that will only contain the numbers from our string
        String onlyNumbersString = "";

        // looping through each element of the list --> 12, java, 5, apple, 3
        for (String eachElement : list) {
            // initializing a variable that will contain only our numbers from our list (12, 5, 3)
            String eachNumberString = "";
            // looping through each character of eachElement of the string
            // this loop works on each element of the String
            for (int i = 0; i < eachElement.length(); i++) {
                Character each = eachElement.charAt(i); // we create a Character variable, which will allow us to use the Collections class and it's methods, to determine of the Character is a digit or not
                if (Character.isDigit(each)) { // if a Character is a digit
                    eachNumberString += each; // then each Character gets concatinated to the eachNumberString
                }

            }
            onlyNumbersString += eachNumberString + " "; // we then concatinate each number to another string, and keep them separate through a space " "

        }
        System.out.println(onlyNumbersString);
        // we split our only Numbers String into an array of String, and split it by the space that we created above
        String[] each = onlyNumbersString.split(" ");
        // we loop through each element of the array
        for (String eachElement : each) {
            // we create an if condition that checks if the element is a space, and if it is, we skip this element
            if (eachElement.equals("")) {
                continue;
            }
            // if the element is not a space "", then we add up eachElement through the Integer.parseInt method, which allows us to transform string into an int data type
            sum += Integer.parseInt(eachElement);

        }

        return sum;

    }
}
