package AleksandarM.Week1;

import java.util.Scanner;

public class Task2_DivideMethod {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");

        int num1 = input.nextInt();

        System.out.println("Enter a number you want to divide with:");
        int divideBy = input.nextInt();

        int result = 0;

        while (num1 >= divideBy){

            num1 = num1-divideBy;
            result++;
        }

        System.out.println(result);

    }


/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */



}
