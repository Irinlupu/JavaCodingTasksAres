package Aleksandar.Week5;

import java.util.Scanner;

public class T1_findUnique {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter your string: ");

        String str = input.next();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result+= ch;
            }
        }

        System.out.println(result);


    }

}
//String - Find the unique
// Write a return method that can find the unique characters from the String
// Ex: unique("AAABBBCCCDEF") ==> "DEF";
