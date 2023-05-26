package AleksandarM.Week2;

import java.util.Scanner;

public class Task3_consecutiveNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();


        for (int i = 1; i <= num ; i++) {
            if (i%2 == 0 && i%3 == 0 && i%5==0){
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0 ||i % 2 == 0 && i % 5 == 0 ||i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                System.out.println("codility");
            }else {
                System.out.println(i);
            }

            }

        }




}
/*
Numbers – Print Consecutive Numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
EX:
Numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers, 2,3 and 5, should be replaced by CodilityTestCoders.
 */
