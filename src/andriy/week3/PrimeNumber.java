package andriy.week3;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrimeNumber(int num) {

        if (num <= 1) {
            System.err.println("Invalid number");
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String yesOrNo;

        do {
            System.out.println("Enter your number:");
            int num = input.nextInt();

            if (isPrimeNumber(num)) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is NOT a prime number");
            }
            System.out.println("Would you like to enter another number: Y/N");
            yesOrNo = input.next();
        } while (yesOrNo.equalsIgnoreCase("y"));

        input.close();
    }
}
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not.

 */