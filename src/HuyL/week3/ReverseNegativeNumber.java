package HuyL.week3;

import java.util.Scanner;

public class ReverseNegativeNumber {

    public static int reverseNegativeNum(int num) {

        int reverse = 0;
        int lastNum; // assign lastNum variable
        while (num != 0){ // uses While loop with condition is number is not equal to 0
            lastNum = num%10; // to store last digit to lastNum variable
            reverse = reverse*10+lastNum; // to store last digit to reverse variable
            num = num / 10; // to eliminate last digit
        }
        return reverse; // returns reverse version number that number we are given
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println(number+" is returned to "+ reverseNegativeNum(number));

    }
}
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
