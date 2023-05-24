package AleksandarM.Week1;

import java.util.Scanner;

public class Task1_OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        while (!(num == 0)) {

        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is Odd number");
            }

        }

            System.out.println("Enter a number or press 0 to Exit:");
            num = input.nextInt();
        }

        input.close();


    }

/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

 */




}
