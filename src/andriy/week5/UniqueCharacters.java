package andriy.week5;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = input.nextLine();
        input.close();
        System.out.println(uniqueChar(str));
    }

    public static String uniqueChar(String str) {

        StringBuilder newStr =new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count==1){
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
/*
 Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */