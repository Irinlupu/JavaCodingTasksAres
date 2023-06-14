package HuyL.week4;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first letters: ");
        String letters1 = scan.next();

        System.out.println("Enter second letters: ");
        String letters2 = scan.next();

        System.out.println(sameLetters(letters1, letters2));
    }

    public static boolean sameLetters(String str1, String str2) {

        char[] ch1 = str1.toCharArray(); //I assign str1 with toCharArray() method and to variable ch1
        char[] ch2 = str2.toCharArray(); //I assign str2 with toCharArray() method to variable ch2
        Arrays.sort(ch1); // use sort method to sort order
        Arrays.sort(ch2); // use sort method to sort order

        String letters1 = "", // I assign empty string to variables letters1 and letters2 to store final values
                letters2 = "";

        for (char each : ch1) { // I use "for each loop" to access value of ch1 array
            letters1 += each; // this one to add values to variable letters1
        }

        for (char each : ch2) { // I use "for each loop" to access value of ch2 array
            letters2 += each; // this one to add values to variable letters2
        }

        return letters1.equals(letters2); // returns true if both letters are equals, returns false if both letters are not equals
    }
}