package Aleksandar.Week3;

import java.util.Scanner;

public class PrimeNumber {
    /*
    Numbers -- Prime Number
    Write a method that can check if a number is prime or not.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();


            if (num < 0) {
                System.err.println("Sorry, invalid number");
                System.exit(0);
            }

            if (num != 1 && num != 2) {
                if (num % 2 == 0) {
                    System.out.println(num + " Is not a Prime number");
                } else {
                    System.out.println(num + " Is a Prime number");
                }

            } else {
                System.out.println(num + " Is a Prime number");



            }while (num != 0) {

            System.out.println("Please enter a number or press 0 to exit");
            num = input.nextInt();

            if (num < 0) {
                System.err.println("Sorry, invalid number");
                System.exit(0);
            }

            if (num != 1 && num != 2) {
                if (num % 2 == 0) {
                    System.out.println(num + " Is not a Prime number");
                } else {
                    System.out.println(num + " Is a Prime number");
                }

            } else {
                System.out.println(num + " Is a Prime number");
        }

        }


    }

}
