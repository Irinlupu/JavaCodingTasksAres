package HuyL.week5;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any letters: ");
        String letters = scan.nextLine();

        System.out.println(reverseString(letters));
    }


    public static String reverseString(String str){

        String frequency = "";// assigns empty string to frequency variable
        for (int i = str.split("").length - 1; i >= 0; i--) { // firs use split method to convert str string to array, and for loop to access elements of array from last index to first index
            frequency += str.charAt(i); // store array to frequency
        }

        return frequency;
    }
}
