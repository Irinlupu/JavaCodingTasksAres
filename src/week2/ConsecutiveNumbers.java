package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsecutiveNumbers {

    /*
Numbers – Print Consecutive Numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
 Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
 it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

EX:
Numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers,
 2,3 and 5, should be replaced by CodilityTestCoders.
 */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        ArrayList<Integer> codilityTestCoders = new ArrayList<>();
        ArrayList<Integer> codilityTest = new ArrayList<>();
        ArrayList<Integer> codility = new ArrayList<>();

        if (num <= 0){
            System.err.println("Invalid Entered");
            System.exit(0);
        }

        for (int i = 1; i <= num; i++) {


                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    codilityTestCoders.add(i);
                }else if (i % 2 == 0 && i % 3 == 0 || i % 2 ==0 && i % 5 == 0 || i % 3 ==0 && i % 5 == 0) {
                    codilityTest.add(i);
                }else if (i % 2 == 0 || i % 3 == 0 || i % 5 ==0 ) {
                    codility.add(i);
                }
        }

        System.out.println("CodilityTestCoders numbers are : " + codilityTestCoders);
        System.out.println("CodilityTest numbers are : " +codilityTest);
        System.out.println("Codility numbers are : " +codility);


        input.close();

    }
}











