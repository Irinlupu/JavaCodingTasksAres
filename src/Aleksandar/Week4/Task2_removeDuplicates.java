package Aleksandar.Week4;

import java.util.Scanner;

public class Task2_removeDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your string: ");
        String str = input.next();

        String result = "";

        for (int i = 0, j =1; i < str.length(); i++, j++) {
          String each = str.charAt(i) + "";

           if (!result.contains(each)){
                result +=each;
            }else {
                continue;
            }

            }
        System.out.println(result);

        }


    }



//String -- Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC
