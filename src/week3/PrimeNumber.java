package week3;

import java.util.Scanner;

public class PrimeNumber {


    /*

    Numbers -- Prime Number
    Write a method that can check if a number is prime or not.

    */

    public static boolean isPrimeNumber(int num){

        if (num <= 1){
            return false;
        }
        for (int i = 2; i*i <= num ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is prime number or not?");
        int num = input.nextInt();

        System.out.println(isPrimeNumber(num));


        input.close();



    }


}
