package Aleksandar.Week4;

import java.util.Scanner;

public class Task3_frequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println("PLease enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String everyChar = "";

        for (int i = 0; i < str.length(); i++) {
            if (!everyChar.contains(""+ str.charAt(i))){
                everyChar += ""+str.charAt(i);
            }
        }

        String print = "";

        for (int k = 0; k < everyChar.length(); k++) {
            int count = 0;

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == everyChar.charAt(k)) {
                count++;
            }
            print = everyChar.charAt(k) + "" + (count)+ " ";
        }
            System.out.print(print);

        }

    }

}

//String -- Frequency of Characters
//Write a return method that can find the frequency of characters
//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2