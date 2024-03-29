package andriy.week3;

import java.util.Scanner;

public class ReverseNegativeNumber {

    public static int reverseNegNumber(int num) {

       // String strNum = String.valueOf(num);

        String strNum2 = Integer.toString(num);
        String minus = strNum2.substring(0, 1);
        String rest = strNum2.substring(1);
        String reverse = "";

        for (int i = rest.length() - 1; i >= 0; i--) {
            reverse += rest.charAt(i);
        }
        reverse = minus + reverse;
        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();

        while (num >= 0){
            System.err.println("Invalid number");
            System.out.println("Try again:");
            num = input.nextInt();
        }

        input.close();

        System.out.println(reverseNegNumber(num));
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53

 */