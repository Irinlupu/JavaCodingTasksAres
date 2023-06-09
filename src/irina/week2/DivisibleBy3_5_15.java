package irina.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleBy3_5_15 {
    /*
    Numbers – Divisible by 3, 5, 15
        Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section.
            if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section.
            if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section.
    EX:
     Input: 100
        Output: Divisible By 15 15 30 45 60 75 90
                Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */

    public static void main(String[] args) {

        boolean startOver = false;

        do {
            System.out.println("Please enter a positive number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            List<Integer> divisibleBy15 = new ArrayList<>();
            List<Integer> divisibleBy3 = new ArrayList<>();
            List<Integer> divisibleBy5 = new ArrayList<>();


            for (int i = 1; i <= num; i++) {

                if (i % 15 == 0) {
                    divisibleBy15.add(i);
                } else if (i % 3 == 0) {
                    divisibleBy3.add(i);
                } else if (i % 5 == 0) {
                    divisibleBy5.add(i);
                }

            }

            System.out.println("Divisible By 15  " + divisibleBy15);
            System.out.println("Divisible By 3  " + divisibleBy3);
            System.out.println("Divisible By 5  " + divisibleBy5);

            System.out.println("Would you like to enter another number?");
            Scanner input2 = new Scanner(System.in);
            String answer = input2.next();

            if (answer.equalsIgnoreCase("yes")) {
                startOver = true;
            }


        } while (startOver);


    }
}
