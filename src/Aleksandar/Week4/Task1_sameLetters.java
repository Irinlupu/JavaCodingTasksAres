package Aleksandar.Week4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_sameLetters {

   public static boolean IsItSame (String str1, String str2){

       char[] ch1 = str1.toCharArray();
       char[] ch2 = str2.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);

       String word1="";
       String word2="";

       for (char each : ch1) {
           word1+=each;
       }

       for (char each2 : ch2){
           word2+=each2;
       }

       return word1.equals(word2);

   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a words: ");
        System.out.println(IsItSame(input.next(), input.next()));

    }



}
//String -- Same letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false: