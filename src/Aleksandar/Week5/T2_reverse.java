package Aleksandar.Week5;

import java.util.Scanner;

public class T2_reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your string: ");
        String str = input.next();

        String reverse = "";

        for (int i = str.length()-1 ; i >= 0 ; i--) {

            reverse += str.charAt(i);

        }

        System.out.println(reverse);

    }

}
//String -- Reverse
// Write a function that can reverse String
// Ex: Reverse("ABCD"); ==> DCBA
