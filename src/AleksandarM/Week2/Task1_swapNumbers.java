package AleksandarM.Week2;

import java.util.Scanner;

public class Task1_swapNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;

        do {

            System.out.println("Enter Number 1:");
            int num1 = input.nextInt();
            System.out.println("Enter Number 2:");
            int num2 = input.nextInt();


            System.out.println("Number 1 is: " + num1 + " Number 2 is: " + num2);

            num1 = num1 + num2;

            num2 = num1 - num2;
            num1 = num1 - num2;


            System.out.println("Swapped variables, Number 1 is: " + num1 + " Number 2 is: " + num2 + "\nType \"continue\" or \"exit\"");

            answer = input.next();

        }while (answer.equalsIgnoreCase("continue"));

        input.close();
        
        
    }
    
}
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

 */