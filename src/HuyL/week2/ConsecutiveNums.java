package HuyL.week2;

import java.util.Scanner;

public class ConsecutiveNums {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int input = new Scanner(System.in).nextInt();

        if (input>0){

            String divisibleByAllNums = "";
            String divisibleBy2 = "";
            String divisibleBy3 = "";
            String divisibleBy5 = "";
            for (int i = 1; i < input; i++) {
                if (i%2==0 && i%3==0 && i%5==0){
                    divisibleByAllNums += i+ ":Codility, Test, and Coders |";
                } else if (i%2==0 )  {
                    divisibleBy2 += i+ ":Codility |";
                } else if (i%3==0) {
                    divisibleBy3 += i+ ":Test |";
                } else if (i%5==0) {
                    divisibleBy5 += i+ ":Coders |";
                }else {
                    System.out.println(i+" ");
                }
            }
            System.out.println("Divisible By All Three numbers 2, 3, 5: "+divisibleByAllNums+" ");
            System.out.println("Divisible By 2: "+divisibleBy2);
            System.out.println("Divisible By 3: "+divisibleBy3);
            System.out.println("Divisible By 5: "+divisibleBy5);

        }else {
            System.out.println("Invalid number");
            System.exit(1);
        }
    }
}
/*
Print Consecutive Numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
EX:
Numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers, 2,3 and 5, should be replaced by CodilityTestCoders.
 */
