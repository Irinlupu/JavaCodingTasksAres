package HuyL.week4;

import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = scan.next();

        System.out.println(frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str){

        String frequency = ""; // I assign empty string to variable result String to store final values

        for (int i = 0; i < str.length(); i++) { //I use "for loop" to access and repeat the every single index of str String
            char ch = str.charAt(i); // I assign String str variable with charAt() method to variable ch to get the first character
            int count = 0; // I assign 0 to Integer count variable to store frequency of character

            for (int j = 0; j < str.length(); j++) { //I use "for loop" to access and repeat the every single index of str String
                char ch2 = str.charAt(j);// I assign String str variable with charAt() method to variable chj to get the first character
                if (ch2==ch){ // I create the condition if value of both char chi and chj are equals
                    count++;// then count them
                }
            }

            if (frequency.contains(""+ch)){ // I add if statement to check the character is already included in the frequency
                continue; // this to skip that character
            }

            frequency += ch+""+count; // to add char and int to frequency string
        }

        return frequency;
    }
}
