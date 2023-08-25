package andriy.week5;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word:");
        String str = input.nextLine();
        input.close();
        System.out.println(reverseString1(str));
    }

    public static String reverseString(String str) {
        StringBuilder reverseStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }
        return reverseStr.toString();
    }


    public static String reverseString1(String str) {
        String reverse="";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}
/*
 Write a function that can reverse String
 Ex: Reverse("ABCD"); ==> DCBA
 */