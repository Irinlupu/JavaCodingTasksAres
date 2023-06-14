package Ergun.week2;

import java.util.Scanner;

public class SwapNumbers {

    /*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

 */

    public static void swapNumbers(int num1, int num2){

        num1 = num1 +num2;
        num2 =num1-num2;
        num1 = num1-num2;

        System.out.println("Swapped num1 is " + num1);
        System.out.println("Swapped num2 is " + num2);

    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter first number to swap");
        int num1 = input.nextInt();
        System.out.println("Please Enter first number to swap");
        int num2 = input.nextInt();

        input.close();

        swapNumbers(num1,num2); // Will swap two number by entered




    }

}
