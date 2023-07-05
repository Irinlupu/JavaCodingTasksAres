package HuyL.week5;

import java.util.Collections;
import java.util.Scanner;

public class UniqueChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = scan.nextLine();

        System.out.println(uniqueChar(str));
    }

    public static String uniqueChar(String str){

        String uniqueChar = ""; // assign empty string to variable uniqueChar
        for (int i = 0; i < str.length(); i++) { // use for loop to access index numbers of str string
            char ch = str.charAt(i); // to get every single letter with charAt method
            if (str.indexOf(ch)==str.lastIndexOf(ch)){ // use if statement with condition to fine any letters have the same or more than 1
                uniqueChar+=ch; // to store the unique letters in uniqueChar
            }
        }

        return uniqueChar; // returns the unique letters

    }
}
